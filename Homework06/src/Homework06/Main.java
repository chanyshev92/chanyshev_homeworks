package Homework06;

public class Main {

    //функция оиска индекса числа в массиве
    public static int getIndexofNumber(int[] array, int number) {

        int index = 0;

        for (int i = 0; i < array.length; i++) {

            index++;
            //если число найдено, возвращаем индекс
            if (array[i] == number) {
                return index;
            }
        }

        //если число отсутствует
        return -1;

    }

    //процедура сдвига ненулевых чисел влево
    public static void moveNotZeros(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i]==0){

                int j=i;

                while((array[j]==0)&&(j<array.length-1)){
                    j++;
                }

                array[i]=array[j];
                array[j]=0;

            }
        }

        System.out.println();
    }

    //процедура печати массива
    public static void print(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] a = {3, 10, -5, 15, 23, 0, 0, 0, 48, -30, 0, 0, 0, 1, 2};
        print(a);

        int result1 = getIndexofNumber(a,23);
        int result2 = getIndexofNumber(a,44);
        System.out.println(result1 + " " + result2 + " ");

        moveNotZeros(a);
        print(a);
    }

}
