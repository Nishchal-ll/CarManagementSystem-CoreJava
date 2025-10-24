package models;

public class Car {
    private String model;
    private String brand;
    private double price;
    private String engineType;

    public Car(String model, String brand, double price, String engineType) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getEngineType() {
        return engineType;
    }

    // toString method
    @Override
    public String toString() {
        return model + " | " + brand + " | Rs." + price + " | " + engineType;
    }
}

