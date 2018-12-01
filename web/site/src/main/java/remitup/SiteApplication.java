package remitup;

import akka.initializer.AkkaManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The entry point for the Sagan web application.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"remitup"})
@EntityScan(basePackages = {"remitup"})
@ComponentScan(basePackages = {"remitup"})
public class SiteApplication {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(SiteApplication.class);

    @Autowired
    private AkkaManager akkaManager;

    public static void main(String[] args) {
        SpringApplication.run(SiteApplication.class, args);       
    }

    @Bean
    public CommandLineRunner run() throws Exception {
        return args -> {
            LOGGER.info("The actor system name is {}", akkaManager.getActorSystemName());            
        };
    }
}
