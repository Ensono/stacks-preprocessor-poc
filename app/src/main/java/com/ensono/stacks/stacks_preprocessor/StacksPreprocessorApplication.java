package com.ensono.stacks.stacks_preprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"com.ensono.stacks"})
public class StacksPreprocessorApplication {

	public static void main(String[] args) {

		#if USE_AWS
			log.info("AWS is set");
		#endif

		#if USE_AZURE
			log.info("AZURE is set");
		#endif

		#if USE_DYNAMODB
			log.info("DYNAMODB is set");
		#endif

		#if USE_COSMOS
			log.info("COSMOS is set");
		#endif

		#if USE_SQS
			log.info("SQS is set");
		#endif

		#if USE_KAFKA
			log.info("KAFKA is set");
		#endif

		#if USE_SERVICEBUS
			log.info("SERVICEBUS is set");
		#endif



		SpringApplication.run(StacksPreprocessorApplication.class, args);


	}

}
