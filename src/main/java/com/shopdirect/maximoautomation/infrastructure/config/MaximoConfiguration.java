package com.shopdirect.maximoautomation.infrastructure.config;

import com.shopdirect.maximoautomation.infrastructure.maximo.client.MaximoClient;
import com.shopdirect.maximoautomation.infrastructure.maximo.client.impl.JAXBMaximoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

@Configuration
public class MaximoConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.shopdirect.maximoautomation.infrastructure.maximo.ws");
        return marshaller;
    }

    @Bean
    public MaximoClient maximoClient(Jaxb2Marshaller marshaller) {
        Authenticator
                .setDefault(
                        new SimpleAuthenticator("gyowanny.pessattoqueiroz@shopdirect.com", "Viviana0906")
                );
        JAXBMaximoClient client = new JAXBMaximoClient();
        client.setDefaultUri("https://esls1uat.eu.smi.ibm.com/meaweb/services/MXISWOCHANGE");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
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
