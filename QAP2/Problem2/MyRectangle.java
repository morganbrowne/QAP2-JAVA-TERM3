package QAP2.Problem2;

import QAP2.Problem1.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // MyRectangle constructor with MyPoints.. 
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight)
    {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2)
    {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    
    }

    public MyPoint getTopLeft()
    {
        return topLeft;
    }

    public MyPoint getBottomRight()
    {
        return bottomRight;
    }

    public void setTopLeft(MyPoint topLeft)
    {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight)
    {
        this.bottomRight = bottomRight;
    }

    // Width of rectangle...
    public int getWidth()
    {
        return Math.abs(bottomRight.getX() - topLeft.getX());// Math.abs() takes absolute value of the result form the subtraction, ensures that the result is always non-negative... 
    }

    //Height of Rectangle... 
    public int getHeight()
    {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Area of Rectangle...
    public int getArea()
    {
        return getWidth() * getHeight();
    }

    // perimeter of rectangle...
    public int getPerimeter()
    {
        return 2 * (getWidth() + getHeight());
    }

    public String toString()
    {
        return "My Rectangle [topLeft = " + topLeft + ", bottomRight = " + bottomRight + ", width = " + getWidth() + ", height = " + getHeight() + "]";
    }

}

