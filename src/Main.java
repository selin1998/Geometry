import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Figure> a= new ArrayList<>();
        Point p1= new Point(1,2);
        Point p2= new Point(4,5);
        Point p3= new Point(8,15);

        Circle c= new Circle(p1,p2);
        Rectangle r= new Rectangle(p1,p3);
        Triangle t= new Triangle(p1,p2,p3);
        a.add(c);
        a.add(r);
        a.add(t);

        for(Figure f: a){
            System.out.println(f.area());

        }


    }
}
