public class Main {
    public static void main(String[] args) {

        System.out.println("1ая часть");

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

        System.out.println("2ая часть");

        LinkedList<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(120);
        list.add(-10);
        list.add(11);
        list.add(50);
        list.add(100);
        list.add(99);

        list.print();

        System.out.println("Элемент с индексом 7 текущего списка");
        System.out.println(" "+list.get(7));

        list.addToBegin(77);
        list.addToBegin(88);
        list.addToBegin(99);

        list.print();

        System.out.println("Элемент с индексом 7 текущего списка");
        System.out.println(" "+list.get(7));




    }
}
