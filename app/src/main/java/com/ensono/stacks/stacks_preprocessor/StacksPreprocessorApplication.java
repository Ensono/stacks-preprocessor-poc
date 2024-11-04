package com.ensono.stacks.stacks_preprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ensono.stacks"})
public class StacksPreprocessorApplication {

	public static void main(String[] args) {


		#if OS_MAC
			System.out.println("Running on Mac");
		#endif

		#if TEST
			System.out.println("TEST is set");
		#endif

		#if TEST2
			System.out.println("TEST2 is set");
		#endif

		#if DYNAMODBX
			System.out.println("DYNAMODB is set");
		#endif

		#if COSMOSX
			System.out.println("COSMOS is set");
		#endif



		SpringApplication.run(StacksPreprocessorApplication.class, args);


	}

}
