package tn.esprit.projetrevisiontp7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ProjetRevisionTp7Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjetRevisionTp7Application.class, args);
    }

}
