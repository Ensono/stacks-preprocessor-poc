package com.ensono.stacks.stacks_preprocessor.dynamodb;

import com.ensono.stacks.stacks_preprocessor.commons.StacksPersistence;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public interface StacksDynamoDBRepository<T> extends StacksPersistence<T> {

  default void useDynamoDB(Logger log) {
    log.debug("  -> Repo using DynamoDB");
  }
}
