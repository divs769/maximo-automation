package jenkins

import org.springframework.http.*
import file.*
import org.springframework.web.client.RestTemplate
import git.GitUpdater

class RegisterCI {

    private String projectRoot
    private JenkinsConfigReader jenkinsConfigReader
    private GitUpdater gitUpdater

    RegisterCI(projectRoot, jenkinsConfigReader, gitUpdater) {
        this.projectRoot = projectRoot
        this.jenkinsConfigReader = jenkinsConfigReader
        this.gitUpdater = gitUpdater
    }

    def register(String jenkinsURL, String username, String apiCredentials, String jobName) {

        updateGit('ServiceInitialised')

        def encoding = getEncoding(username, apiCredentials)
        def xmlConfigFile = readJenkinsXML()
        def headers = getHeaders(encoding)

        HttpEntity<String> entity = new HttpEntity<String>(xmlConfigFile, headers)
        String url = "http://$jenkinsURL//createItem?name=$jobName"
        callEndpoint(entity,url)
    }

    private updateGit(String message){
        gitUpdater.update(message)
    }

    private readJenkinsXML(){
        String jenkinsXMLPath = projectRoot + "/init/src/main/resources/JenkinsConfig.xml"
        jenkinsConfigReader.read(jenkinsXMLPath)
    }

    private getHeaders(String encoding){
        HttpHeaders headers = new HttpHeaders()
        headers.setContentType(MediaType.APPLICATION_XML)
        headers.add("Authorization", "Basic " + encoding)
        headers
    }

    private getEncoding(String username, String apiCredentials){
        Base64.getEncoder().encodeToString((username + ":" + apiCredentials).getBytes())
    }

    private callEndpoint(HttpEntity<String> entity, String url){
        println "Pushing code to Jenkins pipeline"
        RestTemplate rest = new RestTemplate()

        try{
            rest.exchange(url, HttpMethod.POST, entity, String.class)
        }catch(Exception e){
            println "Error carrying out registerCI : $e"
            System.exit(1)
        }

    }

}