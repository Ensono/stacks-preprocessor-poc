package com.ensono.stacks.stacks_preprocessor.controller;


#if USE_AZURE

import com.ensono.stacks.azure.Azure;
#elif USE_AWS

import com.ensono.stacks.aws.AWS;
#endif

#if USE_DYNAMODB
import com.ensono.stacks.dynamodb.DynamoDB;
import com.ensono.stacks.dynamodb.StacksDynamoDBRepository;
#elif USE_COSMOS
import com.ensono.stacks.cosmos.CosmosDB;
import com.ensono.stacks.cosmos.StacksCosmosRepository;
#endif

#if USE_SQS
import com.ensono.stacks.sqs.SQS;
#elif USE_KAFKA
import com.ensono.stacks.kafka.Kafka;
#elif USE_SERVICEBUS
import com.ensono.stacks.servicebus.ServiceBus;
#endif

import com.ensono.stacks.commons.CommonStuff;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RequestMapping("/test")
@RestController
@Slf4j
public class TestController {

  #if USE_AZURE
  @Autowired
  private Azure azure;
  #elif USE_AWS
  @Autowired
  private AWS aws;
  #endif

  #if USE_DYNAMODB
  @Autowired
  private DynamoDB dynamoDB;

  #elif USE_COSMOS
  @Autowired
  private CosmosDB cosmosDB;
  #endif

  #if USE_SQS
  @Autowired
  private SQS sqs;
  #elif USE_KAFKA
  @Autowired
  private Kafka kafka;
  #elif USE_SERVICEBUS
  @Autowired
  private ServiceBus serviceBus;
  #endif

  @Autowired
  private CommonStuff commonStuff;

  #if USE_DYNAMODB
  @Autowired
  private StacksDynamoDBRepository<String> dynamoDBrepository;

  #elif USE_COSMOS
  @Autowired
  private StacksCosmosRepository<String> cosmosDBrepository;
  #endif

  @GetMapping
  public ResponseEntity<String> test() {
    #if USE_AWS
    aws.usingAWS();
    #elif USE_AZURE
    azure.usingAzure();
    #endif

    return ResponseEntity.ok("ACK");
  }

  @PostConstruct
  public void execute() {

    commonStuff.loaded();

    #if USE_AWS
    aws.usingAWS();
    #elif USE_AZURE
    azure.usingAzure();
    #endif

    #if USE_DYNAMODB
    dynamoDB.usingDynamoDB();
    dynamoDBrepository.useDynamoDB(log);
    #elif USE_COSMOSDB
    cosmosDB.usingCosmosDB();
    cosmosDBrepository.useCosmos(log);
    #endif

    #if USE_SQS
    sqs.sendUsingSqs();
    #elif USE_KAFKA
    kafka.sendUsingKafka();
    #elif USE_SERVICEBUS
    serviceBus.sendUsingServiceBus();
    #endif

  }
}
