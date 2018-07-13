package remitup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
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
    public static void main(String[] args) {
        SpringApplication.run(SiteApplication.class, args);
    }
}
