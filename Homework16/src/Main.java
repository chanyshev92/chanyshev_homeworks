public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(33);
        numbers.add(15);
        numbers.add(11);
        numbers.add(89);
        numbers.add(17);
        numbers.add(21);
        numbers.add(89);
        numbers.add(123);
        numbers.add(321);
        numbers.add(83);
        numbers.add(33);
        numbers.add(19);
        numbers.add(42);
        numbers.add(10);
        numbers.add(17);
        numbers.add(8);
        numbers.add(5);

        System.out.println("Исходный массив");
        System.out.println("Кол-во элементов: " + numbers.getSize());
        numbers.print();

        System.out.println("Массив, без элемента под индексом 7");
        //удаляем число 123 из массива
        numbers.removeAt(7);
        System.out.println("Кол-во элементов: " + numbers.getSize());
        numbers.print();

        System.out.println("Массив зачищен и добавлен 0й элемент");
        numbers.clear();
        numbers.add(5);
        numbers.print();

    }
}
