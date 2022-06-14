public class Rectangle extends Shape {

        public Rectangle(int posx, int posy) {
            super(posx, posy);
            System.out.println("In Rectangle constructor");
        }

        @Override
        public void draw() {
            System.out.println("Drawing rectangle");
        }
    }

