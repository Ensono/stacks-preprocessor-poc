package com.ensono.stacks.stacks_preprocessor.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public TestService() {
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

    }
}
