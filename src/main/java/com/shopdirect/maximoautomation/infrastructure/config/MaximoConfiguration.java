package com.shopdirect.maximoautomation.infrastructure.config;

import com.shopdirect.maximoautomation.infrastructure.maximo.client.MaximoClient;
import com.shopdirect.maximoautomation.infrastructure.maximo.client.impl.JAXWSMaximoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

@Configuration
public class MaximoConfiguration {
    //https://esls1uat.eu.smi.ibm.com/meaweb/services/MXISWOCHANGE
    @Value("${ibm.maximo.url}")
    private String maximoUrl;
    @Value("${ibm.maximo.user}")
    private String maximoUser;
    @Value("${ibm.maximo.password}")
    private String maximoPassword;

    @Bean
    @Autowired
    public MaximoClient maximoClient(MaximoChangeRequestConfig maximoChangeRequestConfig) {
        Authenticator.setDefault(new SimpleAuthenticator(maximoUser, maximoPassword));
        JAXWSMaximoClient client = new JAXWSMaximoClient(maximoUrl, maximoChangeRequestConfig);

        return client;
    }

    private static class SimpleAuthenticator extends Authenticator{
        private String username, password;

        public SimpleAuthenticator(String username,String password){
            this.username = username;
            this.password = password;
        }

        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(username,password.toCharArray());
        }
    }
}
