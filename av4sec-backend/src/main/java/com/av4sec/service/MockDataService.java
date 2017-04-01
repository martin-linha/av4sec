package com.av4sec.service;

import com.av4sec.persistance.document.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;

/**
 * Created by martinlinha on 01.04.17.
 */
@Service
@PropertySource("classpath:avasec.properties")
public class MockDataService {

    @Value("${stage}")
    private String stage;

    @Autowired
    private UserService userService;

    @PostConstruct
    public void init() {
        if ("development".equals(stage)) {
            Arrays.asList(
                    User.builder()
                            .firstname("John")
                            .lastname("Doe")
                            .email("john@doe.com")
                            .build(),
                    User.builder()
                            .firstname("Stue")
                            .lastname("Pitt")
                            .email("stue@pitt.com")
                            .build(),
                    User.builder()
                            .firstname("Pepe")
                            .lastname("Roni")
                            .email("pepe@roni.com")
                            .build()
            ).forEach(user -> userService.save(user));
        }
    }
}
