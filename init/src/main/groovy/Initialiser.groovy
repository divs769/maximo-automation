import file.AWSIdentityRetriever
import file.FileConfigReader
import file.ServiceStackConfigFileWriter
import file.ConfigFileFormatter
import file.ConfigFileWriter
import file.FileAndFolderRenamer
import file.GrafanaDashboardRenamer
import file.JenkinsConfigRenamer
import file.ReadMeRenamer
import file.S3Reader
import file.JenkinsConfigReader
import jenkins.RegisterCI
import git.GitResolver
import git.GitUpdater
import git.GitAddAll
import git.GitCommit
import git.GitPush
import naming.NameFormatter
import stack.ECRParameterBuilder
import stack.ParameterMapper
import stack.ServiceStackConfigFileUpdater
import stack.ServiceStackInitialiser
import stack.StackFactory
import ui.UserInputHandler
import utilities.HttpCaller
import versioning.VersionInitialiser
import vpc.VPCConfigParser
import vpc.VPCConfigReader

class Initialiser {

    public static final String INITIAL_VERSION_PROMPT =
            "\nPlease input a desired version number in the following format - MAJOR.MINOR.PATCH (e.g. 1.0.0):"
    public static
    final String TEAM_ACCOUNT_NUMBER = "\nPlease input your team account number (press enter to default to 669711333016):"
    public static
    final String SHARED_ACCOUNT_NUMBER = "\nPlease input your shared account number (press enter to default to 669711333016):"
    public static
    final String NUMBER_OF_ECS_TASKS_PROMPT = "\nPlease input the desired number of ECS tasks you would like to run for this service (minimum 2, press enter to default to 2):"
    public static
    final String JENKINS_PUBLIC_IP = "\nPlease input the public IP of the Jenkins box you would like to register with (press enter to default to 52.31.65.36)"
    public static
    final String JENKINS_USERNAME = "\nPlease input your Jenkins username: "
    public static
    final String JENKINS_API_CREDENTIALS = "\nPlease input your Jenkins API key: "
    public static
    final String FINAL_INPUT_PROMPT = "\nPlease check you have the correct values in your config files before continuing. Press ENTER to continue..."

    private GitResolver gitResolver
    private NameFormatter nameFormatter
    private UserInputHandler userInputHandler
    private ConfigFileWriter configFileWriter
    private ServiceStackConfigFileWriter serviceStackConfigFileWriter
    private FileAndFolderRenamer fileAndFolderRenamer
    private GrafanaDashboardRenamer grafanaDashboardRenamer
    private JenkinsConfigRenamer jenkinsConfigRenamer
    private ServiceStackInitialiser serviceStackInitialiser
    private VersionInitialiser versionInitialiser
    private ReadMeRenamer readMeRenamer
    private ServiceStackConfigFileUpdater serviceStackConfigFileUpdater
    private AWSIdentityRetriever awsIdentityRetriever
    private GitUpdater gitUpdater
    private RegisterCI registerCI

    Initialiser(gitResolver, nameFormatter, userInputHandler, ServiceStackConfigFileWriter, configFileWriter, fileAndFolderRenamer, grafanaDashboardRenamer,
                jenkinsConfigRenamer, serviceStackInitialiser, versionInitialiser, readMeRenamer, serviceStackConfigFileUpdater, awsIdentityRetriever, gitUpdater, registerCI) {

        this.gitResolver = gitResolver
        this.nameFormatter = nameFormatter
        this.userInputHandler = userInputHandler
        this.serviceStackConfigFileWriter = ServiceStackConfigFileWriter
        this.configFileWriter = configFileWriter
        this.fileAndFolderRenamer = fileAndFolderRenamer
        this.grafanaDashboardRenamer = grafanaDashboardRenamer
        this.jenkinsConfigRenamer = jenkinsConfigRenamer
        this.serviceStackInitialiser = serviceStackInitialiser
        this.versionInitialiser = versionInitialiser
        this.readMeRenamer = readMeRenamer
        this.serviceStackConfigFileUpdater = serviceStackConfigFileUpdater
        this.awsIdentityRetriever = awsIdentityRetriever
        this.gitUpdater = gitUpdater
        this.registerCI = registerCI
    }

    static void main(String[] args) {

        String serviceName

        if(args.length > 0)
            serviceName = args[0]

        Initialiser initialiser = getInitialiser()
        initialiser.initialise(serviceName)
    }

    static String getProjectRoot() {
        File currentFile = new File('')
        currentFile.getAbsoluteFile().getParent()
    }

    def initialise(String serviceName) {

            String repositoryName = gitResolver.getRepoName()
            serviceName = (serviceName == null) ? serviceStackInitialiser.setServiceNameToLowercase(repositoryName) : serviceName
            String gitUrl = gitResolver.getRepoUrl()
            String packageName = nameFormatter.getPackageName(serviceName)
            String initialVersion = userInputHandler.promptForInput(INITIAL_VERSION_PROMPT)
            String teamAccountNumber = userInputHandler.promptForInput(TEAM_ACCOUNT_NUMBER)
            if (teamAccountNumber.isEmpty())
                teamAccountNumber = '669711333016'
            String sharedAccountNumber =userInputHandler.promptForInput(SHARED_ACCOUNT_NUMBER)
            if (sharedAccountNumber.isEmpty())
                sharedAccountNumber = '669711333016'
            String numberOfTasks = userInputHandler.promptForInput(NUMBER_OF_ECS_TASKS_PROMPT)
            if (numberOfTasks.isEmpty())
                numberOfTasks = 2
            String displayableServiceName = nameFormatter.getDisplayableServiceName(serviceName)
            String jenkinsPublicIP = userInputHandler.promptForInput(JENKINS_PUBLIC_IP)
            if (jenkinsPublicIP.isEmpty())
                jenkinsPublicIP = 'jenkins.ignite.lsdg.com'
            String jenkinsPort = ':8080'
            String jenkinsUrl = jenkinsPublicIP + jenkinsPort
            String jenkinsUsername = userInputHandler.promptForInput(JENKINS_USERNAME)
            String jenkinsApiCredentials = userInputHandler.promptForInput(JENKINS_API_CREDENTIALS)
            userInputHandler.promptForInput(FINAL_INPUT_PROMPT)

            serviceStackConfigFileWriter.write(serviceStackConfigFileUpdater.update(serviceName, sharedAccountNumber, numberOfTasks))
            configFileWriter.writeNameAndVersionToFile(serviceName, initialVersion, teamAccountNumber, sharedAccountNumber, numberOfTasks)
            fileAndFolderRenamer.rename(packageName)
            grafanaDashboardRenamer.rename(serviceName, displayableServiceName)
            readMeRenamer.rename(displayableServiceName)
            jenkinsConfigRenamer.rename(gitUrl, displayableServiceName)
            serviceStackInitialiser.initialise(serviceName)
            versionInitialiser.copyFile(serviceName, teamAccountNumber)
            registerCI.register(jenkinsUrl, jenkinsUsername, jenkinsApiCredentials, serviceName)

    }
    static Initialiser getInitialiser() {

        UserInputHandler userInputHandler = new UserInputHandler()
        AWSIdentityRetriever awsIdentityRetriever = new AWSIdentityRetriever()

        VPCConfigReader vpcConfigReader = new VPCConfigReader(new S3Reader(), new VPCConfigParser(), awsIdentityRetriever)
        FileConfigReader fileConfigReader = new FileConfigReader(projectRoot + '/init/src/main/resources/service-stack-config.txt')
        FileConfigReader devFileConfigReader = new FileConfigReader(projectRoot + '/init/src/main/resources/dev-service-stack-config.txt')
        FileConfigReader uatFileConfigReader = new FileConfigReader(projectRoot + '/init/src/main/resources/uat-service-stack-config.txt')
        FileConfigReader nftFileConfigReader = new FileConfigReader(projectRoot + '/init/src/main/resources/nft-service-stack-config.txt')
        FileConfigReader prdFileConfigReader = new FileConfigReader(projectRoot + '/init/src/main/resources/prd-service-stack-config.txt')

        def envFileConfigReaders = [:]
        envFileConfigReaders.put("dev", devFileConfigReader)
        envFileConfigReaders.put("uat", uatFileConfigReader)
        envFileConfigReaders.put("nft", nftFileConfigReader)
        envFileConfigReaders.put("prd", prdFileConfigReader)

        ParameterMapper parameterMapper = new ParameterMapper()

        ServiceStackInitialiser serviceStackInitialiser = new ServiceStackInitialiser(new UserInputHandler(),
                new StackFactory(), new HttpCaller(), vpcConfigReader, parameterMapper, fileConfigReader, envFileConfigReaders, new ECRParameterBuilder(awsIdentityRetriever))

        new Initialiser(new GitResolver(), new NameFormatter(), userInputHandler,
                new ServiceStackConfigFileWriter(projectRoot, '/init/src/main/resources/service-stack-config.txt'),
                new ConfigFileWriter(projectRoot, new ConfigFileFormatter()),
                new FileAndFolderRenamer(projectRoot),
                new GrafanaDashboardRenamer(projectRoot),
                new JenkinsConfigRenamer(projectRoot), serviceStackInitialiser, new VersionInitialiser(), new ReadMeRenamer(projectRoot),
                new ServiceStackConfigFileUpdater(parameterMapper, fileConfigReader), awsIdentityRetriever,
                new GitUpdater(new GitAddAll(projectRoot), new GitCommit(projectRoot), new GitPush(projectRoot)),
                new RegisterCI(getProjectRoot(),new JenkinsConfigReader(), new GitUpdater(new GitAddAll(projectRoot), new GitCommit(projectRoot), new GitPush(projectRoot)))
        )

    }

}