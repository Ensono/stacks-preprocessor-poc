package com.ensono.stacks.stacks_preprocessor.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestServiceTest {

  @Test
  public void getValueTest() {
    Assertions.assertEquals("HelloWorld", new TestService().getValue());
  }
}
