package com.ensono.stacks.stacks_preprocessor.repository;

#if DYNAMODBX
import com.ensono.stacks.dynamodb.StacksDynamoDBRepository;
#elif COSMOSX

import com.ensono.stacks.cosmos.StacksCosmosRepository;
#endif

public interface AppDatabaseRepository
    #if DYNAMODBX
    extends StacksDynamoDBRepository<String>
    #elif COSMOSX
    extends StacksCosmosRepository<String>
    #endif {
  // Used as an example of using Manifold to implement only one specific interface using #if notation
}
