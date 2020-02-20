public class Triangle extends Figure {


    private  Point p1;
    private Point p2;
    private Point p3;
    private int area;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Triangle(Point p1, Point p2, Point p3) {
        setP1(p1);
        setP2(p2);
        setP3(p3);


    }

    int area(){

        this.area= (int)(p1.getX()*(p2.getY()-p3.getY())+ p2.getX()*(p3.getY()-p2.getY()) + p3.getX()*(p1.getY()-p2.getY()))/2;
            return this.area;

    }

}
