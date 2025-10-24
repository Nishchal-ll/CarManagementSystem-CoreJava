import models.Car;
import services.showroom;
import utils.filehandler;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showroom showroom = new showroom();
        showroom.getCars().addAll(filehandler.loadCars());
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Car Showroom Management ====");
            System.out.println("1. Add Car");
            System.out.println("2. Display Cars");
            System.out.println("3. Search Car");
            System.out.println("4. Remove Car");
            System.out.println("5. Save & Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Model: ");
                    String model = sc.nextLine();
                    System.out.print("Enter Brand: ");
                    String brand = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Engine Type: ");
                    String engine = sc.nextLine();
                    showroom.addCar(new Car(model, brand, price, engine));
                    break;

                case 2:
                    showroom.displayCars();
                    break;

                case 3:
                    System.out.print("Enter Model to Search: ");
                    String search = sc.nextLine();
                    Car found = showroom.searchCar(search);
                    System.out.println(found != null ? found : " Car not found.");
                    break;

                case 4:
                    System.out.print("Enter Model to Remove: ");
                    String remove = sc.nextLine();
                    showroom.removeCar(remove);
                    break;

                case 5:
                    filehandler.saveCars(showroom.getCars());
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
