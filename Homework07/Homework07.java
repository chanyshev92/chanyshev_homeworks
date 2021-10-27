import java.util.Scanner;

public class Homework07 {

    public static void main(String[] args) {
        int a = -101;
        int minCount = 0;
        int Number = -200;
        //создаем массив для учета количества вошедших чисел.201 индекс-это[-100;100]
        int[] countArray = new int[201];
        Scanner scanner = new Scanner(System.in);

        while (a != -1) {
            //вводим очередное число
            System.out.print("New Number: ");
            a = scanner.nextInt();

            //записываем по смещенному ключу
            countArray[a + 100]++;

            //записываем последнее количество(для -1) чтобы исключить 0 в массиве
            minCount = countArray[a + 100];

        }

        //ищем максимальный индекс с минимальным положительным значением массива
        for (int i = 0; i < 201; i++) {

            //если просто >, то будт минимальный индекс
            if ((minCount >= countArray[i]) && (countArray[i] > 0)) {

                minCount = countArray[i];
                Number = i - 100;

            }
        }

        //вывод полченного числа
        System.out.format("The Biggest Number with MinCount %d",Number);
    }

}
