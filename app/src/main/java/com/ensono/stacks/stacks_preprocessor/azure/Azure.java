package com.ensono.stacks.stacks_preprocessor.azure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class Azure {

  public void usingAzure() {
    log.debug("USING AZURE");
  }

  @PostConstruct
  public void loaded() {

    log.debug("... AZURE Loaded");
  }
}
