public class Ellipse extends Figure {

    public Ellipse(int x, int y, double rad1, double rad2) {

        super(x, y, 0, 0, rad1, rad2);
        System.out.println("Ellipse is initialized");

    }

    public double getPerimeter() {

        return 4 * (Math.PI * rad2 * rad1 + (rad1 - rad2) * (rad1 - rad2)) / (rad1 + rad2);
    }

}
