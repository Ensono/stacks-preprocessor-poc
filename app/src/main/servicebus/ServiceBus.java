package com.ensono.stacks.servicebus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class ServiceBus {

  public void sendUsingServiceBus() {
    log.debug("SEND USING SERVICEBUS");
  }

  @PostConstruct
  public void loaded() {

    log.debug("... SERVICEBUS Loaded");
  }
}
