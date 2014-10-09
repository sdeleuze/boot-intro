package demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	// TODO: 1) Read Application class, run with gradle plugin and with plain java command
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
