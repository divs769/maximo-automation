package file

class ConfigFileWriter {

    private ConfigFileFormatter configStringFormatter
    private String projectRoot

    private String configFileLocation = '/src/main/resources/service-config'

    ConfigFileWriter(projectRoot, configStringFormatter) {
        this.projectRoot = projectRoot
        this.configStringFormatter = configStringFormatter
    }

    def writeNameAndVersionToFile(String serviceName, String initialVersion, String teamAccountNumber, String sharedAccountNumber,
                                  String numberOfECSTasks) {

        File sdgConfigFile = new File(projectRoot + configFileLocation)
        sdgConfigFile.write(configStringFormatter.format(serviceName, initialVersion, teamAccountNumber, sharedAccountNumber, numberOfECSTasks))
    }
}
