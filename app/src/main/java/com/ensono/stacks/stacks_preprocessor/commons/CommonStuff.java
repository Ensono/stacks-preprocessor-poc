package com.ensono.stacks.stacks_preprocessor.commons;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class CommonStuff {

  @PostConstruct
  public void loaded() {

    log.debug("... COMMON Loaded");
  }
}
