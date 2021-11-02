public class Circle extends Ellipse {

    public Circle(int x, int y, double rad) {
        super(x, y, rad, rad);
        System.out.println("Circle is initialized");
    }

}
