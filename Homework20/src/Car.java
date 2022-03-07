public class Car {
    private final String licensePlate;
    private final String model;
    private final String color;
    private final int price;
    private final int mileage;

    public Car(String licensePlate, String model, String color, int price, int mileage) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }
}
