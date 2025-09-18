package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// TestFile = Test Environmnet
public class HamcrestTest {
  // Test List
  @Test
  void testCalculator() {
    String actualResult = "hello";
    // ! Junit 5
    assertEquals("hello", actualResult);
    // ! Hamcrest (aligns English Grammar)
    assertThat(actualResult, is(equalTo("hello")));

    SumCalculator c1 = new SumCalculator();
    assertThat(c1.operate(10, 4), is(equalTo(14)));
  }
}
