public class Rectangle extends Figure{
    public Rectangle(int x,int y, int a, int b) {

        setX(x);
        setY(y);
        this.a = a;
        this.b = b;
        this.rad1 = 0;
        this.rad2 = 0;
        setFigureMover(figureMover=null);
        name="Rectangle";

    }
}
