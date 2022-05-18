package javaTraining;

import org.testng.annotations.Test;

public class TestOne {
  @Test
  public void testArea() {
    Square s = new Square(5);
    assert s.area()==25;
  }

}