public class Ellipse extends Figure{
    public Ellipse(int x, int y, double rad1, double rad2) {

        setX(x);
        setY(y);
        this.a = 0;
        this.b = 0;
        this.rad1 = rad1;
        this.rad2 = rad2;
        setFigureMover(figureMover=null);
        name="Ellipse";
    }
}
