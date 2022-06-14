import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args) {
        Circle c = new Circle(100, 300);
        Shape s1 = new Circle(200, 400);
        Rectangle r1 = new Rectangle(10,50);

        Canvas cvs = new Canvas();
        cvs.addShape(c);
        cvs.addShape(s1);
        cvs.addShape(r1);

        cvs.drawAll();

        ArrayList<Shape> ns = new ArrayList<>();
        ns.add(r1);
        System.out.println(cvs.setShapes(ns));

    }
}
