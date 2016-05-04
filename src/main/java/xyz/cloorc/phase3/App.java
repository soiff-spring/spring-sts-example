package xyz.cloorc.phase3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@Slf4j
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
    
    @Bean
    public CommandLineRunner getRunner() {
    	return new CommandLineRunner() {
			public void run(String... args) throws Exception {
				log.info( "Hello World!" );
			}
    	};
    }
}
