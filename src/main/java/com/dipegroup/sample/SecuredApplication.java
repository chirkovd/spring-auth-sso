package com.dipegroup.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Project: spring-auth-sso
 * Description:
 * Date: 8/26/2017
 *
 * @author Dmitriy_Chirkov
 * @since 1.8
 */

@SpringBootApplication
public class SecuredApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecuredApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

}
