public class Sequence {

    /***
     *
     * @param array входной массив целых чисел
     * @param condition экземпляр интерфейса, содержащий условие для входного массива
     * @return выходной массив целых числ, удовлетворяющий условию из condition
     */

    public static int[] filter(int[] array, ByCondition condition) {

        //количество элементов, удовлетворяющее condition.isOk
        int count = 0;

        // вспомогательный массив, такой же длинный, как и исходный
        int[] intermediate = new int[array.length];

        //проходим по массиву, проверяем каждый элемент на условие
        for (int a : array)

            if (condition.isOk(a)) {

                intermediate[count] = a;
                count++;

            }

        /* очевидно, что кол-во элементов удовлетворяющих условию <= изначального,
         поэтому избавимся от "лишних нулей" в конце массива */
        int[] result = new int[count];
        System.arraycopy(intermediate, 0, result, 0, count);

        return result;
    }

}
