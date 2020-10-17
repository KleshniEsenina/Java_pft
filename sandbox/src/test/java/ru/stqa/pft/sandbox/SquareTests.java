package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.point.Point;

public class SquareTests {
  @Test
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(),25.0);

    Point p = new Point(0,0);
    Point p1 = new Point(3,4);
    Assert.assertEquals(p.distance(p1),5.0);

    assert p.distance(p1)==5;

        Assert.assertEquals(p.distance(p1),6.0);
    //Для примера сделал 1 неправильный
  }

}
