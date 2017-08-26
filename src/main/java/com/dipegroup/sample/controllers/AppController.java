package com.dipegroup.sample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Project: spring-auth-sso
 * Description:
 * Date: 8/26/2017
 *
 * @author Dmitriy_Chirkov
 * @since 1.8
 */

@RestController
public class AppController {

    @Autowired
    private BCryptPasswordEncoder encoder;

    @RequestMapping(value = "/public/time", method = RequestMethod.GET)
    public String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE);
    }

    @RequestMapping(value = "/secured/user", method = RequestMethod.GET)
    public Principal getCurrentUser(Principal principal) {
        return principal;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/secured/secret", method = RequestMethod.GET)
    public String getAdminSecret(Principal principal) {
        return encoder.encode(principal.getName());
    }
}
