import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class Main {

    //номера черных или с нулевым пробегом
    public static void licensePlatesOfBlackOrNewCars() {

        System.out.println("Номера черных машин или машин с нулевым пробегом");

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

            reader.lines()

                    .filter(s -> {

                        String[] strings = s.split("\\|");
                        return strings[4].equals("0") || strings[2].equals("Black");

                    })

                    .map(s -> {

                        String[] strings = s.split("\\|");
                        return strings[0];

                    })

                    .forEach(System.out::println);

        } catch (IOException e) {

            throw new IllegalArgumentException(e);

        }
    }

    //средняя цена камри
    public static void camryAveragePrice() {

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

            double averagePrice = reader.lines()

                    .filter(s -> {

                        String[] strings = s.split("\\|");
                        return strings[1].equals("Camry");

                    })

                    .mapToInt(s -> {

                        String[] strings = s.split("\\|");
                        return Integer.parseInt(strings[3]);

                    })

                    .average()
                    .getAsDouble();

            System.out.println("Средняя цена на Camry " + averagePrice);

        } catch (IOException e) {

            throw new IllegalArgumentException(e);

        }
    }

    //разные модели ценой 700-800 тыс.
    public static void differentModelsWithPriceFrom700To800() {

        System.out.println("Разные модели ценой 700-800 тыс.:");

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

            reader.lines()

                    .filter(s -> {

                        String[] strings = s.split("\\|");
                        int price = Integer.parseInt(strings[3].trim());
                        return price >= 700 && price <= 800;
                    })

                    .map(s -> {

                        String[] strings = s.split("\\|");
                        return strings[1];

                    })

                    .distinct()
                    .forEach(System.out::println);

        } catch (IOException e) {

            throw new IllegalArgumentException(e);

        }
    }

    //Цвет машины с минимальной ценой
    public static void colorOfCarWithMinPrice() {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

            String colorOfCarWithMinPrice = reader.lines()

                    .min((s1, s2) -> {

                        String[] strings1 = s1.split("\\|");
                        String[] strings2 = s2.split("\\|");
                        int price1 = Integer.parseInt(strings1[3].trim());
                        int price2 = Integer.parseInt(strings2[3].trim());
                        return Integer.compare(price1, price2);

                    })

                    .map(s -> {

                        String[] strings = s.split("\\|");
                        return strings[2];

                    })

                    .map(Objects::toString)
                    .orElse("");

            System.out.println("Цвет машины с минимальной ценой " + colorOfCarWithMinPrice);

        } catch (IOException e) {

            throw new IllegalArgumentException(e);

        }
    }

    public static void main(String[] args) {

        licensePlatesOfBlackOrNewCars();
        System.out.println();
        camryAveragePrice();
        System.out.println();
        differentModelsWithPriceFrom700To800();
        System.out.println();
        colorOfCarWithMinPrice();

    }
}
