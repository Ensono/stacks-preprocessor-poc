package com.ensono.stacks.dynamodb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class DynamoDB implements StacksDynamoDBRepository<String> {

  public void usingDynamoDB() {
    log.debug("PERSIST USING DYNAMODB");
  }

  @PostConstruct
  public void loaded() {

    log.debug("... DYNAMODB Loaded");
  }
}
