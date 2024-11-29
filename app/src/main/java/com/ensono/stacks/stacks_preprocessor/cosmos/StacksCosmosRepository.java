package com.ensono.stacks.stacks_preprocessor.cosmos;

import com.ensono.stacks.stacks_preprocessor.commons.StacksPersistence;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public interface StacksCosmosRepository<T> extends StacksPersistence<T> {

  default void useCosmos(Logger log) {
    log.debug("  -> Repo using Cosmos");
  }
}
