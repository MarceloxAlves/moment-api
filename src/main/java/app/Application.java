package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.TimeZone;

@SpringBootApplication
@EntityScan(basePackages ="model")
@EnableJpaRepositories(basePackages ="repository")
@ComponentScan(basePackages =  {"controller","config","service","validator"})
@EnableJpaAuditing
public class Application {
    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        System.out.println("Spring boot application running in UTC timezone :"+new Date());   // It will print UTC timezone
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
