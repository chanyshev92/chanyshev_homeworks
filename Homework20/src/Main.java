import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Objects;
import java.util.OptionalDouble;


public class Main {

    //номера черных или с нулевым пробегом
    public static void licensePlatesOfBlackOrNewCars() {

        System.out.println("Номера черных машин или машин с нулевым пробегом");

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

            reader.lines()

                    .map(s -> {

                        String[] strings = s.split("\\|");
                        return new Car(strings[0], strings[1], strings[2], Integer.parseInt(strings[3]), Integer.parseInt(strings[4]));

                    })

                    .filter(car -> car.getMileage() == 0 || car.getColor().equals("Black"))

                    .map(Car::getLicensePlate)

                    .forEach(System.out::println);

        } catch (IOException e) {

            throw new IllegalArgumentException(e);

        }
    }

    //средняя цена камри
    public static void camryAveragePrice() {

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

            OptionalDouble averagePrice = reader.lines()

                    .map(s -> {

                        String[] strings = s.split("\\|");
                        return new Car(strings[0], strings[1], strings[2], Integer.parseInt(strings[3]), Integer.parseInt(strings[4]));

                    })

                    .filter(car -> car.getModel().equals("Camry"))

                    .mapToDouble(Car::getPrice)

                    .average();

            if (averagePrice.isPresent()) {

                System.out.println("Средняя цена на Camry " + averagePrice.getAsDouble());

            }


        } catch (IOException e) {

            throw new IllegalArgumentException(e);

        }
    }

    //количество разных моделей ценой 700-800 тыс.
    public static void countOfDifferentModelsWithPriceFrom700To800() {

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

            long count = reader.lines()

                    .map(s -> {

                        String[] strings = s.split("\\|");
                        return new Car(strings[0], strings[1], strings[2], Integer.parseInt(strings[3]), Integer.parseInt(strings[4]));

                    })

                    .filter(car -> car.getPrice() >= 700 && car.getPrice() <= 800)

                    .map(Car::getModel)

                    .distinct()

                    .count();

            System.out.println("Количество разных моделей ценой 700-800 тыс. - " + count);

        } catch (IOException e) {

            throw new IllegalArgumentException(e);

        }
    }

    //Цвет машины с минимальной ценой
    public static void colorOfCarWithMinPrice() {

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

            String colorOfCarWithMinPrice = reader.lines()

                    .map(s -> {

                        String[] strings = s.split("\\|");
                        return new Car(strings[0], strings[1], strings[2], Integer.parseInt(strings[3]), Integer.parseInt(strings[4]));

                    })


                    .min(Comparator.comparingInt(Car::getPrice))

                    .map(Car::getColor)

                    .map(Objects::toString)
                    .orElse("");

            System.out.println("Цвет машины с минимальной ценой - " + colorOfCarWithMinPrice);

        } catch (IOException e) {

            throw new IllegalArgumentException(e);

        }
    }

    public static void main(String[] args) {

        licensePlatesOfBlackOrNewCars();
        System.out.println();
        camryAveragePrice();
        System.out.println();
        countOfDifferentModelsWithPriceFrom700To800();
        System.out.println();
        colorOfCarWithMinPrice();

    }
}
