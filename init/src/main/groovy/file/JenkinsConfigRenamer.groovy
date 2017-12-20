package file

class JenkinsConfigRenamer {
    private String projectRoot

    public static final String JENKINS_CONFIG_FILE_NAME = "/init/src/main/resources/JenkinsConfig.xml"
    public static final String ORIGINAL_GIT_URL = "git@bitbucket.org:ShopDirect/microservice-template.git"
    public static final String ORIGINAL_SERVICE_NAME_DISPLAYABLE = "Microservice Template"

    JenkinsConfigRenamer(projectRoot){
        this.projectRoot = projectRoot
    }

    def rename(String gitURL, String serviceNameDisplayable) {

        File file = new File(projectRoot + JENKINS_CONFIG_FILE_NAME)
        String contents = file.getText('UTF-8')
        contents = contents.replace(ORIGINAL_GIT_URL, gitURL)
        contents = contents.replace(ORIGINAL_SERVICE_NAME_DISPLAYABLE, serviceNameDisplayable)
        file.setText(contents)
    }
}