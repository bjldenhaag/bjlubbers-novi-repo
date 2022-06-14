public abstract class Shape {
    private int posx;
    private int posy;

    public Shape(int px, int py) {
        this.posx = px;
        this.posy = py;
        System.out.println("In Shape constructor");
    }

    public abstract void draw();
}
