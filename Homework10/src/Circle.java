public class Circle extends Ellipse{
    public Circle(int x,int y, double rad) {

        super(x,y,rad, rad);
        setFigureMover(figureMover=new MoverToZer0());
        name="Circle";
    }
}
