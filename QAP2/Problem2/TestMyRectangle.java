package QAP2.Problem2;

import QAP2.Problem1.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(7, 4);
        MyPoint p2 = new MyPoint(5, 8);


        MyRectangle rect = new MyRectangle(p1, p2);

        System.out.println(rect);

        System.out.println("Area " + rect.getArea());
        
    }
}
