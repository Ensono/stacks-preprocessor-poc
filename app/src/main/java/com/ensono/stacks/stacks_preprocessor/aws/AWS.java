package com.ensono.stacks.stacks_preprocessor.aws;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class AWS {

  public void usingAWS() {
    log.debug("USING AWS");
  }

  @PostConstruct
  public void loaded() {

    log.debug("... AWS Loaded");
  }
}
