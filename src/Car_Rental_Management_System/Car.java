package Car_Rental_Management_System;

import java.util.Date;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private double pricePerDay;
    private boolean isAvailable;
    private final float taxRate = 0.14f;
    private static int count = 0;

    public Car(String brand, int id, String model, int year, double pricePerDay) {
        this.brand = brand;
        this.id = id;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
        count++;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public static int getCount() {
        return count;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price Per Day: " + pricePerDay);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("----------------------------------");
    }

    public static void displayAll(Car[] cars) {
        if (count == 0) {
            System.out.println("No cars in the fleet.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".");
            cars[i].display();
        }
    }

    public static void displayAvailable(Car[] cars) {
        int availableCount = 0;

        for (int i = 0; i < count; i++) {
            if (cars[i].isAvailable()) {
                availableCount++;
                System.out.println(availableCount + ".");
                cars[i].display();
            }
        }

        if (availableCount == 0) {
            System.out.println("No available cars");
        } else {
            System.out.println("Total Available Cars: " + availableCount);
        }
    }

    public static void searchById(Car[] cars, int id) {

        for (int i = 0; i < count; i++) {
            if (cars[i].id == id) {
                cars[i].display();
                return;
            }
        }

        System.out.println("Car not found");
    }

    public static void searchByBrand(Car[] cars, String brand) {

        int matches = 0;

        for (int i = 0; i < count; i++) {
            if (cars[i].brand.equals(brand)) {
                System.out.println((matches + 1) + ".");
                cars[i].display();
                matches++;
            }
        }

        if (matches == 0) {
            System.out.println("No car with this brand exists");
        } else {
            System.out.println("Total Matches: " + matches);
        }
    }


    public static Car getCar(Car[] cars,int id){
        for (int i = 0 ; i < count ; i++){
            if (cars[i].id == id){
                return cars[i];
            }
        }
        return null;
    }

    public static boolean isUniqueId(Car[] cars , int id){
        for (int i = 0 ; i < count ; i++){
            if(cars[i].id == id){
                return false;
            }
        }
        return true;
    }

    public static void displayStatistics(Car[] cars) {
        if (count == 0) {
            System.out.println("No cars exist");
            return;
        }

        int rentedCount = 0;
        double totalPrice = 0;
        Car mostExpensive = cars[0];

        for (int i = 0; i < count; i++) {
            if (!cars[i].isAvailable()) {
                rentedCount++;
            }

            totalPrice += cars[i].pricePerDay;

            if (cars[i].pricePerDay > mostExpensive.pricePerDay) {
                mostExpensive = cars[i];
            }

        }

        double averagePrice = totalPrice / count;
        System.out.println("Number of Rented Cars : " + rentedCount);
        System.out.println("Most Expensive Car    : " + mostExpensive.brand + " " + mostExpensive.model + " " +  " Price Per Day " + mostExpensive.pricePerDay);
        System.out.println("Average Daily Price   : " + averagePrice);
    }

}
