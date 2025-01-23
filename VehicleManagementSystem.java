import java.util.ArrayList;
importjava.util.Scanner;

class Vehicle {
    private String registrationNumber;
    private String brand;
    private String model;
    private int year;
    private int owner;
    private int price;

    public Vehicle(String registrationNumber, String brand, String model, int year, int owner, int price) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.owner = owner;
        this.price = price;
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

    public int getOwner() {
        return owner;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Registration Number: " + registrationNumber + "\nBrand: " + brand + "\nModel: " + model + "\nYear: " + year + "\nOwner: " + owner + "\nPrice: " + price;
    }
}

public class VehicleManagementSystem{
    private static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
}