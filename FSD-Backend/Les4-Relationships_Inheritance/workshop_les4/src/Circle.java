public class Circle extends Shape {

    public Circle(int posx, int posy) {
        super(posx, posy);
        System.out.println("In Circle constructor");
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
