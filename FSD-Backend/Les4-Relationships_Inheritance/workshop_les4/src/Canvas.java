import java.util.ArrayList;

public class Canvas {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape sss) {
        shapes.add(sss);
    }

    public void drawAll() {
        for (Shape shape : this.shapes) {
            shape.draw();
        }
    }

    public int setShapes(ArrayList<Shape> newShapes) {
        this.shapes = newShapes;
        return newShapes.size();
    }
}
