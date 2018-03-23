package com.test.portal.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.test.portal")
@Slf4j
@SuppressWarnings("PMD.UseUtilityClass")
public class PortalBootApplication {

  public static void main(String[] args) {
    SpringApplication.run(PortalBootApplication.class, args);
  }
}
