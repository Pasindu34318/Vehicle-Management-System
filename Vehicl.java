import java.util.ArrayList;
import java.util.Scanner;


class Vehicle {
    private String registrationNumber;
    private String brand;
    private String model;
    private int year;
    private String owner;
    
    public Vehicle(String registrationNumber, String brand, String model, int year, String owner) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.owner = owner;
    }

    
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getOwner() {
        return owner;    
    }

    public String toString() {
        return "Registration Number: " + registrationNumber +
                "\nBrand: " + brand +
                "\nModel: " + model +
                "\nYear: " + year +
                "\nOwner: " + owner + 
                "\n";
    }
}

public class Vehicl {
    private static ArrayList<Vehicle> vehicleList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nVehicle Management System");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View All Vehicles");
            System.out.println("3. Search Vehicle by Registration Number");
            System.out.println("4. Delete Vehicle by Registration Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    viewAllVehicles();
                    break;
                case 3:
                    searchVehicle();
                    break;
                case 4:
                    deleteVehicle();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addVehicle() {
        System.out.print("Enter registration number: ");
        String registrationNumber = scanner.nextLine();

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter owner name: ");
        String owner = scanner.nextLine();

        Vehicle vehicle = new Vehicle(registrationNumber, brand, model, year, owner);
        vehicleList.add(vehicle);
        System.out.println("Vehicle added successfully!");
    }

    private static void viewAllVehicles() {
        if (vehicleList.isEmpty()) {
            System.out.println("No vehicles available.");
        } else {
            for (int i = 0; i < vehicleList.size(); i++) {
                System.out.println((i + 1) + ". " + vehicleList.get(i));
            }
        }
    }

    private static void searchVehicle() {
        System.out.print("Enter registration number to search: ");
        String regNo = scanner.nextLine();
        boolean found = false;

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRegistrationNumber().equalsIgnoreCase(regNo)) {
                System.out.println(vehicle);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Vehicle not found.");
        }
    }

    private static void deleteVehicle() {
        System.out.print("Enter registration number to delete: ");
        String regNo = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getRegistrationNumber().equalsIgnoreCase(regNo)) {
                vehicleList.remove(i);
                System.out.println("Vehicle deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Vehicle not found.");
        }
    }
}