import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    //номера черных или с нулевым пробегом
    public static void licensePlatesOfBlackOrNewCars() {

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {

            reader.lines().filter(s -> {

                        String[] strings = s.split("\\|");
                        return strings[4].equals("0") || strings[2].equals("Black");

                    }).map(s -> {

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

            System.out.println("Средняя цена на Camry" + averagePrice);

        } catch (IOException e) {

            throw new IllegalArgumentException(e);

        }
    }

    //разные модели ценой 700-800 тыс.
    public static void differentModelsWithPriceFrom700To800() {

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

    public static void main(String[] args) {

        licensePlatesOfBlackOrNewCars();
        camryAveragePrice();
        differentModelsWithPriceFrom700To800();

    }
}
