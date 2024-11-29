package com.ensono.stacks.stacks_preprocessor.cosmos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class CosmosDB implements StacksCosmosRepository<String> {

  public void usingCosmosDB() {
    log.debug("PERSIST USING COSMOSDB");
  }

  @PostConstruct
  public void loaded() {

    log.debug("... COSMOSDB Loaded");
  }
}
