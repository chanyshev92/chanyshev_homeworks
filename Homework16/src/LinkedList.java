public class LinkedList<T> {

    private static class Node<T> {

        T value;
        Node<T> next;

        public Node(T value) {

            this.value = value;

        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size;

    public void add(T element) {
        // создаю новый узел
        Node<T> newNode = new Node<>(element);
        if (size == 0) {

            first = newNode;

        } else {

            last.next = newNode;

        }

        last = newNode;
        size++;
    }

    public void addToBegin(T element) {
        Node<T> newNode = new Node<>(element);

        if (size == 0) {

            last = newNode;

        } else {

            newNode.next = first;

        }

        first = newNode;
        size++;

    }

    private boolean isCorrectIndex(int index) {

        return index >= 0 && index < size;

    }

    public T get(int index) {

        if (isCorrectIndex(index)) {

            //создаю новую ссылку на первый элемент
            Node<T> newNode = first;
            //передвигаю ссылку пока она не укажет на элемент с искомым индексом
            for (int i = 0; i < index; i++) {

                newNode = newNode.next;

            }

            return newNode.value;

        } else return null;
    }

    public void print() {

        Node<T> newNode = first;

        while (newNode.next != null) {

            System.out.print(" " + newNode.value);
            newNode = newNode.next;

        }
        //т.к. last.next==null
        System.out.print(" " + last.value);
        System.out.println(" ");

    }

}
