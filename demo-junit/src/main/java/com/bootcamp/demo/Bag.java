package com.bootcamp.demo;

import java.util.ArrayList;
import java.util.List;
import com.bootcamp.demo.Bag.Ball.Color;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
public class Bag {
  private List<Ball> balls;

  public Bag() {
    this.balls = new ArrayList<>();
  }

  public boolean add(Ball ball) {
    return this.balls.add(ball);
  }

  @Getter
  @EqualsAndHashCode
  @ToString
  public static class Ball {
    private Color color;

    public static Ball ofBlue() {
      return new Ball(Color.BLUE);
    }

    public static Ball ofRed() {
      return new Ball(Color.RED);
    }

    public static Ball ofYellow() {
      return new Ball(Color.YELLOW);
    }

    private Ball(Color color) {
      this.color = color;
    }

    @Getter
    public static enum Color {
      RED, BLUE, YELLOW,;
    }
  }
}
