public class Figure {

    private int x;
    private int y;

    protected int a;
    protected int b;

    protected double rad1;
    protected double rad2;

    public Figure(int x,int y, int a, int b, double rad1, double rad2){
        this.x = x;
        this.y =y;
        this.a = a;
        this.b = b;
        this.rad1 =rad1;
        this.rad2 = rad2;
        System.out.println("Figure is initialized");
    }

    public double getPerimeter(){

        return 0;
    }

}
