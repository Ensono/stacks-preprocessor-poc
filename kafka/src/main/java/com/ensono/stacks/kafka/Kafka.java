package com.ensono.stacks.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class Kafka {

  public void sendUsingKafka() {
    log.debug("SEND USING KAFKA");
  }

  @PostConstruct
  public void loaded() {

    log.debug("... KAFKA Loaded");
  }
}
