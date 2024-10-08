package QAP2.Problem1;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2)
    {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(y1, y2);
    }

    public MyLine(MyPoint begin, MyPoint end)
    {
        this.begin = begin;
        this.end = end;
    }


    // Constructors for "get" and "set"... for "begin" and "end"... 
    public MyPoint getBegin()
    {
        return begin;
    }

    public void setBegin(MyPoint begin)
    {
        this.begin = begin;
    }

    public MyPoint getEnd()
    {
        return end;
    }

    public void setEnd(MyPoint end)
    {
        this.end = end;
    }

    // get and set for coordinates...
    // BEGIN...
    public int getBeginX()
    {
        return begin.getX();
    }

    public void setBeginX(int x)
    {
        begin.setX(x);
    }

    public int getBeginY()
    {
        return begin.getY();
    }

    public void setBeginY(int y)
    {
        begin.setY(y);
    }

    // END....
    public int getEndX()
    {
        return end.getX();
    }

    public void setEndX(int x)
    {
        end.setX(x);
    }

    public int getEndY()
    {
        return end.getY();
    }

    public void setEndY(int y)
    {
        end.setY(y);
    }

    // Length of Line... 
    public double getLength()
    {
        return begin.distance(end);
    }

    // Gradent of Line... 
    public double getGredient()
    {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
    return "MyLine[begin=" + begin.toString() + ", end=" + end.toString() + "]";
}
}
