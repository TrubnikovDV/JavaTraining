package javaTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {
  @Test
  public void testAreaRect () {
    Rectangle r = new Rectangle(4,2);
    Assert.assertEquals(r.area(),8);
  }
}
