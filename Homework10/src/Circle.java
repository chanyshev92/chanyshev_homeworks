public class Circle extends Ellipse {
    public Circle(int x, int y, double rad) {

        super(x, y, rad, rad);
        setFigureMover((x1, y1) -> {

            setX(x1);
            setY(y1);

        });
        setName("Circle");
    }
}
