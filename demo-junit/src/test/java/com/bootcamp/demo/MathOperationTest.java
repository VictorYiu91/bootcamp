package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathOperationTest {
  
  @Test
  void testOperation() {
    MathOperation sumformula = (x, y) -> x + y;
    Assertions.assertEquals(5, sumformula.operate(2, 3));
    Assertions.assertEquals(-4, sumformula.operate(-7, 3));
  }
}
