package ru.stqa.pft.sandbox.point;

import ru.stqa.pft.sandbox.Square;

public class Distance {
  public static void main(String[] args) {
    Point p = new Point(5,8,10,14);

    double x = Math.sqrt(p.area()*p.area()+p.area1()*p.area1());
     System.out.println("Расстояние между точками = " + x);
  }


}
