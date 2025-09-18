package com.bootcamp.demo;

import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Student2Test {
  @Mock
  private SumCalculator sumCalculator;

  @InjectMocks
  private Student student;

  @Test
  void testStudentOperate() {
    Mockito.when(sumCalculator.operate(3, 7)).thenReturn(100);
    int actualResult = student.operate(3, 4);
    Assertions.assertEquals(400, actualResult);
    Mockito.verify(sumCalculator, times(1)).operate(3, 7);
  }
}
