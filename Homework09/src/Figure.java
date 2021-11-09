public class Figure {

    private final int x;
    private final int y;

    protected int a;
    protected int b;

    protected double rad1;
    protected double rad2;

    /***
     *
     * @param x позиция центра фигуры на оси x
     * @param y позиция центра фигуры на оси y
     * @param a длина одной стороны для прямоугольника (и потомка)
     * @param b длина другой стороны для прямоугольника (и потомка)
     * @param rad1 длина одной полуоси для эллипса (и потомка)
     * @param rad2 длина другой полуоси для эллипса (и потомка)
     */
    public Figure(int x, int y, int a, int b, double rad1, double rad2) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        this.rad1 = rad1;
        this.rad2 = rad2;
        System.out.println("Figure is initialized");
    }

    public double getPerimeter() {

        return 0;
    }

}
