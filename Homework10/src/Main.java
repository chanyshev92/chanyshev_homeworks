public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[4];

        figures[0] = new Rectangle(2, 2, 2, 2);

        figures[1] = new Square(3, 3, 3);

        figures[2] = new Ellipse(4, 4, 4, 4);

        figures[3] = new Circle(9, 9, 9);

        for (int i = 0; i < figures.length; i++) {

            System.out.println(i);

            //печатаем имя фигуры и текущее положение
            figures[i].print();

            //сдвигаем фигуры
            figures[i].move(10, 10);

            //если фигура сдвигаемая(очевидно, что сдвинулась методом move), то печатаем еще раз
            if (figures[i].getFigureMover() != null) {

                figures[i].print();
            }
        }
    }
}
