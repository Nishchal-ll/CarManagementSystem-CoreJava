package utils;
import models.Car;
import java.io.*;
import java.util.ArrayList;

public class filehandler {
    private static final String FILE_NAME = "cars.txt";
    public static void saveCars(ArrayList<Car> cars) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Car car : cars) {
                writer.write(car.getModel() + "," + car.getBrand() + "," + car.getPrice() + "," + car.getEngineType());
                writer.newLine();
            }
            System.out.println(" Data saved successfully!");
        } catch (IOException e) {
            System.out.println(" Error saving data: " + e.getMessage());
        }
    }
    public static ArrayList<Car> loadCars() {
        ArrayList<Car> cars = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String model = parts[0];
                String brand = parts[1];
                double price = Double.parseDouble(parts[2]);
                String engine = parts[3];
                cars.add(new Car(model, brand, price, engine));
            }
            System.out.println(" Data loaded successfully!");
        } catch (IOException e) {
            System.out.println("No existing data found. Starting fresh.");
        }
        return cars;
    }
}
