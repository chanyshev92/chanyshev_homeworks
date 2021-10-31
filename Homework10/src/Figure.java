public abstract class Figure {

    //координаты
    protected int x;
    protected int y;

    //стороны прямоугольника
    protected int a;
    protected int b;

    //полуоси эллипса
    protected double rad1;
    protected double rad2;

    //флаг можно ли сдвигать
    protected Mover figureMover;

    //имя для вывода
    protected String name;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setFigureMover(Mover figureMover) {
        this.figureMover = figureMover;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Mover getFigureMover() {
        return figureMover;
    }

    //метод перемещения фигуры в конкретную точку
    public void move(){

        if (figureMover!=null){
            setX(figureMover.newX());
            setY(figureMover.newY());
        }
    }

    //метод печати фигуры и ее текущих координат
    public void print(){

        System.out.println(name+" is on x:"+getX()+" y:"+getY());
    }
}
