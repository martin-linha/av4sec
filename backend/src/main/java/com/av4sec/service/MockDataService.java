package com.av4sec.service;

import com.av4sec.persistance.document.User;
import org.ajbrown.namemachine.Name;
import org.ajbrown.namemachine.NameGenerator;
import org.ajbrown.namemachine.NameGeneratorOptions;
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
      for (int i = 0; i < 40; i++) {
        Name name = new NameGenerator().generateName();
        userService.save(User.builder()
          .email("user" + i + "@testemail.com")
          .firstname(name.getFirstName())
          .lastname(name.getLastName()).build());
      }
    }
  }
}
