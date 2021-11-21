import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] array;
    public static int[] sums;

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numbersCount = scanner.nextInt();
        int threadsCount = scanner.nextInt();

        array = new int[numbersCount];
        sums = new int[threadsCount];
        SumThread[] sumThreads = new SumThread[threadsCount];

        // заполняем случайными числами
        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(100);

        }

        int realSum = 0;

        for (int j : array) {
            realSum += j;
        }

        // для 2 000 000 -> 98996497, 98913187
        System.out.println(realSum);
        int delta = numbersCount / (threadsCount);

        for (int i = 0; i < threadsCount; i++) {

            if (i != threadsCount - 1) {

                sumThreads[i] = new SumThread(i * delta, i * delta + delta);
                sumThreads[i].start();

            } else {

                sumThreads[i] = new SumThread(i * delta, numbersCount);
                sumThreads[i].start();

            }
        }

        for (int i = 0; i < threadsCount; i++) {

            try {

                sumThreads[i].join();

            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }

        for (int i = 0; i < threadsCount; i++) {

            sums[i] = sumThreads[i].getSum();

        }

        int byThreadSum = 0;

        for (int i = 0; i < threadsCount; i++) {

            byThreadSum += sums[i];

        }

        System.out.println(byThreadSum);

    }

}

