package de.woock;

import java.util.Arrays;
import java.util.List;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

@EnableJms
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class BgwKundenApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgwKundenApplication.class, args);
	}
	
//	@Bean
//	ApplicationRunner init(DiscoveryClient dc, UVDao uvDao) {
//		return arg -> {
//			URI uri = dc.getInstances("uv").get(0).getUri();
//			RestTemplate restTemplate = new RestTemplate();
//
//			System.out.println(uri);
//			System.out.println(dc.getServices());
//			System.out.println(restTemplate.getForObject(uri + "/adresse", String.class));
//			
//			System.out.println("from Feign: " + uvDao.adresse());
//			System.out.println(uvDao.alleKunden());
//		};
//	}
	
//    @Bean
//    public OAuth2RestTemplate oAuth2RestTemplate(OAuth2ClientContext context,
//                                                 OAuth2ProtectedResourceDetails authorizationCodeResourceDetails) {
//        return new OAuth2RestTemplate(authorizationCodeResourceDetails, context);
//    }	
	
    @Bean
    public JmsListenerContainerFactory<?> myFactory(ConnectionFactory connectionFactory,
    		                                        DefaultJmsListenerContainerFactoryConfigurer configurer) throws JMSException {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        configurer.configure(factory, connectionFactory);
        
        return factory;
    }
   
    @Bean
    public ConnectionFactory connectionFactory() {
    	ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("admin", "admin", "tcp://localhost:61616");
    	List<String> trustedPackages = Arrays.asList("de.woock.entity,java.lang".split(","));
    	factory.setTrustedPackages(trustedPackages);
    	return factory;
    }

    @Bean
    public JmsTemplate jmsKundenAufgenommenMeldung(){
        JmsTemplate template = new JmsTemplate();
        template.setConnectionFactory(connectionFactory());
        return template;
    }
}
