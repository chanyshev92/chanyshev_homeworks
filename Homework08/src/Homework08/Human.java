package Homework08;

public class Human {

    private String name;

    private double weight;

    // для получения значения
    public String getName() {
        return name;
    }

    public double getWeight() {
        return this.weight;
    }

    // для задания значения

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        if ( weight < 0 || weight > 220) {
            weight = 0;
        }
        this.weight = weight;
    }
}
