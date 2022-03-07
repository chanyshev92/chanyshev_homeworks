public class Rectangle extends Figure {

    public Rectangle(int x, int y, int a, int b) {

        super(x, y, a, b, 0, 0);
        System.out.println("Rectangle is initialized");

    }

    public double getPerimeter() {

        return 2 * (a + b);
    }

}
