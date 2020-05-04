package com.example.Cracking.OverlappingRectangles;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = null;
        Rectangle rect2 = null;
        Point a = null;
        a.x = 0;
        a.y = 10;
        Point b = null;
        b.x = 10;
        b.y = 0;
        Point c = null;
        c.x = 5;
        c.y = 5;
        Point d = null;
        d.x = 15;
        d.y = 0;

        rect1.leftTop = a;
        rect1.rightBottom = b;
        rect2.leftTop = c;
        rect2.rightBottom = d;

        System.out.println(isOverlapping(rect1, rect2));
    }


    static class Point{
        int x;
        int y;
    }
    static class Rectangle{
        Point leftTop;
        Point rightBottom;
    }

    public static boolean isOverlapping(Rectangle rect1, Rectangle rect2) {
        if (rect2.rightBottom.x <= rect1.leftTop.x && rect2.rightBottom.y <= rect1.leftTop.y) {
            return true;
        }

        if (rect1.rightBottom.x <= rect2.leftTop.x && rect1.rightBottom.y <= rect2.leftTop.y) {
            return true;
        }

        return false;

    }

}
