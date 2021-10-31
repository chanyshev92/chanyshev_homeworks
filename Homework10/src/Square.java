public class Square extends Rectangle{
    public Square(int x,int y, int a) {
        super(x,y,a,a);
        setFigureMover(figureMover=new MoverToZer0());
        name="Square";
    }
}
