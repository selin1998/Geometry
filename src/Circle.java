public class Circle extends Figure{

   private  Point p1;
   private Point p2;
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

    public Circle(Point p1, Point p2) {
            setP1(p1);
            setP2(p2);


    }

    int area(){
        int radius=(int)Math.sqrt(getP2().getX()-getP1().getX()) + (int)Math.sqrt(getP2().getY()-getP1().getY()) ;
        this.area= (int)Math.PI*((int)Math.sqrt(radius));
        return this.area;

    }

}
