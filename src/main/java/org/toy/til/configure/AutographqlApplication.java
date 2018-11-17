package org.toy.til.configure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.toy.til")
public class AutographqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutographqlApplication.class, args);
    }
}
