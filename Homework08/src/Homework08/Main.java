package Homework08;

import java.util.Scanner;

public class Main {

    //процедура инициализации массива людей
    public static void initializeHumans(Human[] humans){
        for (int i = 0; i < humans.length; i++) {

            Scanner scanner = new Scanner(System.in);
            humans[i] = new Human();
            humans[i].setName("User" + i);
            System.out.format("Write Weight for User%d ",i);
            double weight = scanner.nextDouble();
            humans[i].setWeight(weight);

        }

    }

    // процедура печати массива людей
    public static void printHumans(Human[] humans){

        for (Human human : humans) {

            System.out.format("Name %s Weight %f %n", human.getName(), human.getWeight());

        }

    }

    //процедура вставки значений полей одного человека в поля другого
    public static void insert(Human humans,Human Zombies){

        humans.setName(Zombies.getName());
        humans.setWeight(Zombies.getWeight());
    }

    //процедура обмена одного элемента массива людей на другого
    public static void swapHumans(Human[] humans, int ind1, int ind2) {

        //создание нового экземпляра Человека
        Human Zombie = new Human();
        //запись в новый экземпляр всех значений полей текущего
        insert(Zombie,humans[ind1]);
        //замена значений полей "первого" человека значениями полей "другого" человека
        insert(humans[ind1],humans[ind2]);
        //замена значений полей "другого" человека на первоначальные значения "первого"
        insert(humans[ind2],Zombie);

    }

    // процедура сортировки массива людей по массе вставками
    public static void insertionSortHumans(Human[] humans){

        for (int i = 0; i < humans.length; i++){

            double min = humans[i].getWeight();
            int minIndex = i;
            for (int j = i + 1; j < humans.length; j++) {

                //нахождение индекса человека с минимальным весом "правее" текущего положения
                if (humans[j].getWeight() < min) {
                    min = humans[j].getWeight();
                    minIndex = j;
                }

            }
            // обмен текущего элемента и найденного людей
            swapHumans(humans,i,minIndex);

        }

    }

    //сортировка массива людей по массе перемешиванием
    public static void shakerSortHumans(Human[] humans) {

        Human Zombie = new Human();
        int left = 0;
        int right = humans.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (humans[i].getWeight() > humans[i + 1].getWeight()) {
                    //insert(Zombie,humans[i]);
                    //insert(humans[i], humans[i+1]);
                    //insert(humans[i+1],Zombie);
                    swapHumans(humans,i,i+1);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (humans[i].getWeight() < humans[i - 1].getWeight()) {
                    //insert(Zombie,humans[i]);
                    //insert(humans[i], humans[i-1]);
                    //insert(humans[i-1],Zombie);
                    swapHumans(humans,i,i-1);
                }
            }
            left++;
        } while (left < right);

    }

    //челночная сортировка людей по весу
    public static void shuttleSortHumans(Human[] humans){
        for (int i = 1; i < humans.length; i++) {
            if (humans[i].getWeight() < humans[i - 1].getWeight()) {
                swapHumans(humans, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (humans[z].getWeight() < humans[z - 1].getWeight()) {
                        swapHumans(humans, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Human[] humans = new Human[10];

        //инициализация массива с людьми
        initializeHumans(humans);

        //вывод начального массива людей
        System.out.println("Input massive ");
        printHumans(humans);

        //сортировка вставками
        //insertionSortHumans(humans);

        //сортировка перемешиванием
        //shakerSortHumans(humans);

        //челночная сортировка
        shuttleSortHumans(humans);

        //вывод итогового массива людей
        System.out.format("Output massive %n");
        printHumans(humans);

    }

}
