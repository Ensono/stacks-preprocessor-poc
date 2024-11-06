package com.ensono.stacks.stacks_preprocessor.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    private static String TEST_VALUE = "HelloWorld";
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

		#if USE_DYNAMODB
			System.out.println("DYNAMODB is set");
		#endif

		#if USE_COSMOS
			System.out.println("COSMOS is set");
		#endif

    }

    public String getValue() {
        return TEST_VALUE;
    }
}
