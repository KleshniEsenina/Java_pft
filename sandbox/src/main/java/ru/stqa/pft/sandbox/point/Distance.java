package ru.stqa.pft.sandbox.point;

import ru.stqa.pft.sandbox.Square;

public class Distance {
  public static void main(String[] args) {
    Point p = new Point(5,8,10,14);

    double x = Math.sqrt(area(p)*area(p)+area1(p)*area1(p));
     System.out.println("Расстояние между точками = " + x);
  }

  public static double area(Point p) {
    return p.x1 - p.x2;
  }

  public static double area1(Point p) {
    return p.y1 - p.y2;

  }
}
