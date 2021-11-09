public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[5];

        System.out.println("Massive is initialized");
        System.out.println();

        figures[0] = new Figure(1, 1, 1, 1, 2, 2);
        System.out.println();

        figures[1] = new Rectangle(2, 2, 2, 2);
        System.out.println();

        figures[2] = new Square(3, 3, 3);
        System.out.println();

        figures[3] = new Ellipse(4, 4, 4, 4);
        System.out.println();

        figures[4] = new Circle(9, 9, 9);
        System.out.println();

        for (Figure figure : figures) {
            System.out.println("Perimeter: " + figure.getPerimeter());

        }
    }
}
