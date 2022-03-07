public class Square extends Rectangle {
    public Square(int x, int y, int a) {
        super(x, y, a, a);
        setFigureMover((x1, y1) -> {
            setX(x1);
            setY(y1);
        });
        setName("Square");
    }
}
