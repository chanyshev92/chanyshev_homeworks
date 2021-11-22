public class Ellipse extends Figure {
    public Ellipse(int x, int y, double rad1, double rad2) {

        setX(x);
        setY(y);
        setA(0);
        setB(0);
        setRad1(rad1);
        setRad2(rad2);
        setFigureMover(null);
        setName("Ellipse");
    }
}
