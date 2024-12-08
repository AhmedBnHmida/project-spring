package tn.esprit.ahmedbenhmida4twin5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAspectJAutoProxy
//@EnableScheduling
public class Ahmedbenhmida4Twin5Application {

    public static void main(String[] args) {
        SpringApplication.run(Ahmedbenhmida4Twin5Application.class, args);
    }

}
