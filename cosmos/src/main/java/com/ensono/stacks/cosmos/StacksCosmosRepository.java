package com.ensono.stacks.cosmos;

import com.ensono.stacks.commons.StacksPersistence;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public interface StacksCosmosRepository<T> extends StacksPersistence<T> {

  default void useCosmos(Logger log) {
    log.debug("  -> Repo using Cosmos");
  }
}
