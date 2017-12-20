package jenkins

import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.web.client.RestTemplate
import git.GitUpdater
import git.GitAddAll
import git.GitCommit
import git.GitPush
import spock.lang.Specification
import spock.lang.Ignore
import file.*

class RegisterCITest extends Specification {

    RegisterCI registerCI = new RegisterCI(getProjectRoot(),new JenkinsConfigReader(), new GitUpdater(new GitAddAll(getProjectRoot()), new GitCommit(getProjectRoot()), new GitPush(getProjectRoot())))

    @Ignore('To be ignored in CI pipeline')
    def "I can successfully use POST operation to pass the JenkinsConfig.xml file to Jenkins"(){

        given: "That I have a JenkinsConfig.xml file and a series of variables. (The crumb will have to be updated every time" +
                "you restart the Jenkins test box"

        def jenkinsBoxPublicIP = "JENKINS_URL_HERE"
        def port = ":8080"
        def jenkinsURL = jenkinsBoxPublicIP + port
        def username = "USERNAME_HERE"
        def apiCredentials = "CREDENTIALS_HERE"
        def jobName = "RegisterCIUnitTest"
        def expected = "pass"

        when: "I call the register method"

        String returned = registerCI.register(jenkinsURL, username, apiCredentials,jobName)

        if(returned != null){
            returned = 'pass'
        }
        else{
            returned = 'fail'
        }

        then: "The JenkinsConfig.xml file is successfully posted to Jenkins"

        returned == expected

        and: "Delete the job from Jenkins"

        delete(username, apiCredentials, jenkinsURL, jobName)
    }


    def retrieve(HttpURLConnection httpObject){
        int responseCode = httpObject.getResponseCode()
        println("Response Code : " + responseCode)
        responseCode
    }

    def delete(username, apiCredentials, jenkinsURL, jobName){

        RestTemplate rest = new RestTemplate()
        HttpHeaders headers = new HttpHeaders()
        def encoding = Base64.getEncoder().encodeToString((username +":"+ apiCredentials).getBytes())
        headers.add("Authorization", "Basic " + encoding)
        HttpEntity<String> entity = new HttpEntity<String>(null, headers)
        String deleteURL = "http://$jenkinsURL/job/$jobName/doDelete"
        rest.exchange(deleteURL, HttpMethod.POST, entity, String.class)
    }

    static String getProjectRoot() {
        File currentFile = new File('')
        currentFile.getAbsoluteFile().getParent()
    }

}