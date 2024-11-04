package com.ensono.stacks.dynamodb;

import com.ensono.stacks.commons.StacksPersistence;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public interface StacksDynamoDBRepository<T> extends StacksPersistence<T> {

  default void useDynamoDB(Logger log) {
    log.debug("  -> Repo using DynamoDB");
  }
}
