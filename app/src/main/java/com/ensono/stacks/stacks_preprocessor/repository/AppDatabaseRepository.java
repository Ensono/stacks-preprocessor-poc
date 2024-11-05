package com.ensono.stacks.stacks_preprocessor.repository;

#if USE_DYNAMODB
import com.ensono.stacks.dynamodb.StacksDynamoDBRepository;
#elif USE_COSMOS

import com.ensono.stacks.cosmos.StacksCosmosRepository;
#endif

public interface AppDatabaseRepository
    #if USE_DYNAMODB
    extends StacksDynamoDBRepository<String>
    #elif USE_COSMOS
    extends StacksCosmosRepository<String>
    #endif {
  // Used as an example of using Manifold to implement only one specific interface using #if notation
}
