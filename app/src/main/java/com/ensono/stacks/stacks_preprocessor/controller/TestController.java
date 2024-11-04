package com.ensono.stacks.stacks_preprocessor.controller;


#if AZURE

import com.ensono.stacks.azure.Azure;
#elif AWS

import com.ensono.stacks.aws.AWS;
#endif

#if DYNAMODBX
import com.ensono.stacks.dynamodb.DynamoDB;
import com.ensono.stacks.dynamodb.StacksDynamoDBRepository;
#elif COSMOSX
import com.ensono.stacks.cosmos.CosmosDB;
import com.ensono.stacks.cosmos.StacksCosmosRepository;
#endif

#if SQS
import com.ensono.stacks.sqs.SQS;
#elif KAFKA
import com.ensono.stacks.kafka.Kafka;
#elif SERVICEBUS
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

  #if AZURE
  @Autowired
  private Azure azure;
  #elif AWS
  @Autowired
  private AWS aws;
  #endif

  #if DYNAMODBX
  @Autowired
  private DynamoDB dynamoDB;

  #elif COSMOSX
  @Autowired
  private CosmosDB cosmosDB;
  #endif

  #if SQS
  @Autowired
  private SQS sqs;
  #elif KAFKA
  @Autowired
  private Kafka kafka;
  #elif SERVICEBUS
  @Autowired
  private ServiceBus serviceBus;
  #endif

  @Autowired
  private CommonStuff commonStuff;

  #if DYNAMODBX
  @Autowired
  private StacksDynamoDBRepository<String> dynamoDBrepository;

  #elif COSMOSX
  @Autowired
  private StacksCosmosRepository<String> cosmosDBrepository;
  #endif

  @GetMapping
  public ResponseEntity<String> test() {
    execute();

    return ResponseEntity.ok("ACK");
  }

  @PostConstruct
  public void execute() {

    #if AWS
    aws.usingAWS();
    #elif AZURE
    azure.usingAzure();
    #endif

    #if DYNAMODB
    dynamoDB.usingDynamoDB();
    dynamoDBrepository.useDynamoDB(log);
    #elif COSMOSDB
    cosmosDB.usingCosmosDB();
    cosmosDBrepository.useCosmos(log);
    #endif

    #if SQS
    sqs.sendUsingSqs();
    #elif KAFKA
    kafka.sendUsingKafka();
    #elif SERVICEBUS
    serviceBus.sendUsingServiceBus();
    #endif

  }
}
