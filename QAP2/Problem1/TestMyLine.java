package QAP2.Problem1;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        System.out.println("Distance between Point 1 and Point 2: " + p1.distance(p2));

        MyLine line1 = new MyLine(p1, p2);
        System.out.println(line1);
        System.out.println("Length of line 1: " + line1.getLength());
        System.out.println("Gradient of Line 1 " + line1.getGredient());

        line1.setBeginX(0);
        line1.setEndY(10);
        System.out.println(line1);
    }
}
