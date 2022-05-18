package javaTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
  @Test
  public void distance(){
    Point distTest = new Point(3,3,4,5);

    Assert.assertEquals(distTest.distance(),1);
  }
}
