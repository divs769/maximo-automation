package file

import com.amazonaws.services.cloudformation.model.Parameter

class ServiceStackConfigFileWriter {

    private String projectRoot
    private String configFileLocation

    ServiceStackConfigFileWriter(projectRoot, configFileLocation) {
        this.projectRoot = projectRoot
        this.configFileLocation = configFileLocation
    }

    def write(List<Parameter> parameters){
        File sdgConfigFile = new File(projectRoot + configFileLocation)

               StringBuilder str = new StringBuilder()
               for(parameter in parameters) {
                   str.append(parameter.getParameterKey() +"="+ parameter.getParameterValue() + '\n')
               }

        sdgConfigFile.write(str.toString())

        }
}
