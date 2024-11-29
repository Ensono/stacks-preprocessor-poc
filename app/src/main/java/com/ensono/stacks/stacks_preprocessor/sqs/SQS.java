package com.ensono.stacks.stacks_preprocessor.sqs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class SQS {

  public void sendUsingSqs() {
    log.debug("SEND USING SQS");
  }

  @PostConstruct
  public void loaded() {

    log.debug("... SQS Loaded");
  }
}
