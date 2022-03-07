public abstract class Figure {

    //координаты ЦЕНТРА
    private int x;
    private int y;

    //длины сторон прямоугольника
    private int a;
    private int b;

    //полуоси эллипсов

    private double rad1;
    private double rad2;

    //флаг можно ли сдвигать
    private Mover figureMover;

    //имя для вывода
    private String name;

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

    public void setA(int a) {

        this.a = a;
    }

    public void setB(int b) {

        this.b = b;
    }

    public void setRad1(double rad1) {

        this.rad1 = rad1;
    }

    public void setRad2(double rad2) {

        this.rad2 = rad2;
    }

    public void setName(String name) {

        this.name = name;
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
    public void move(int x, int y) {

        if (getFigureMover() != null) {
            getFigureMover().destination(x, y);
        }
    }

    //метод печати имени фигуры и ее текущих координат
    public void print() {

        System.out.println(name + " is on x:" + getX() + " y:" + getY());
    }
}
