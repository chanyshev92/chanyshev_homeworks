/***
 *
 * @param <T> Generic class
 */
public class ArrayList<T> {

    private static final int DEFAULT_SIZE = 10;

    private T[] elements;
    private int size;

    public ArrayList() {

        this.elements = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;

    }

    public int getSize() {

        return size;

    }

    public void add(T element) {

        if (fullArray()) {

            resize();

        }

        this.elements[size] = element;
        size++;
    }

    private boolean fullArray() {

        return size == elements.length;

    }

    private void resize() {

        T[] oldElements = this.elements;

        // создаем новый массив, который больше предыдущего в 1,5 раза
        this.elements = (T[]) new Object[oldElements.length + oldElements.length / 2];

        // копируем все элементы из старого массива в новый
        if (size >= 0) System.arraycopy(oldElements, 0, this.elements, 0, size);


    }

    public T get(int index) {

        if (isCorrectIndex(index)) {

            return elements[index];

        } else {

            return null;

        }
    }

    private boolean isCorrectIndex(int index) {

        return index >= 0 && index < size;

    }

    public void clear() {

        for (int i = 0; i < size; i++) {

            this.elements[i] = null;

        }

        this.size = 0;

    }


    public void removeAt(int index) {

        if (isCorrectIndex(index)) {

            for (int i = 0; i < size - 1; i++) {

                if (i >= index) {

                    elements[i] = elements[i + 1];

                }

            }

            size--;
            elements[size] = null;

        }

    }

    public void print() {

        for (T element : this.elements) {

            System.out.print(" " + element);

        }

        System.out.println(" ");

    }


}
