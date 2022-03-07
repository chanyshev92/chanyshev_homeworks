import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //входной массив целых чисел
        int[] numbers = {1, 2, 44, 66, 44, 125, 128, 876, 654, -11, -22};

        //масссив, каждый элемент которого четный
        int[] result1 = Sequence.filter(numbers, number -> (number % 2 == 0));

        System.out.println(Arrays.toString(result1));

        //массив сумма цифр каждого элемента - четная
        int[] result2 = Sequence.filter(numbers, number -> {

            int sum = 0;

            while (number != 0) {

                sum += number % 10;
                number = number / 10;

            }

            return sum % 2 == 0;
        });

        //вывод массива
        System.out.println(Arrays.toString(result2));

    }
}
