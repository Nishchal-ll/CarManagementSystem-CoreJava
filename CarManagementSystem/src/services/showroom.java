package services;
import models.Car;
import java.util.ArrayList;

public class showroom {
    private ArrayList<Car> cars = new ArrayList<>();

    // Add new car
    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Car added successfully!");
    }

    public void displayCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars in the showroom.");
        } else {
            System.out.println("\n--- Car List ---");
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }

    public Car searchCar(String model) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model)) {
                return car;
            }
        }
        return null;
    }

    public void removeCar(String model) {
        Car car = searchCar(model);
        if (car != null) {
            cars.remove(car);
            System.out.println(" Car removed successfully!");
        } else {
            System.out.println(" Car not found.");
        }
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
