import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        int a = -101;
        int minCount = 0, Number = -200;
        int[] countArray = new int[201];
        Scanner scanner = new Scanner(System.in);

        while (a != -1) {
            System.out.print("New Number: ");
            a = scanner.nextInt();
            countArray[a + 100]++;
            minCount = countArray[a + 100];
        }

        for (int i = 0; i < 201; i++) {
            if ((minCount >= countArray[i]) && (countArray[i] > 0)) {
                minCount = countArray[i];
                Number = i - 100;
            }
        }

        System.out.println("The Biggest Number with MinCount " + Number);
    }
}
