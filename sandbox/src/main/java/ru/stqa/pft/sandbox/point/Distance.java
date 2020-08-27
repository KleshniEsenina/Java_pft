package ru.stqa.pft.sandbox.point;

import ru.stqa.pft.sandbox.Square;

public class Distance {
  public static void main(String[] args) {
    Point p = new Point();
    p.x1 = 5;
    p.y1 = 10;
    p.x2 = 8;
    p.y2 = 14;
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
