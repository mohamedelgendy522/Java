package Car_Rental_Management_System;

import java.util.Date;

public class LuxuryCar extends Car{
    private double insuranceFee;
    private final int minDays = 3 ;
    public LuxuryCar(String brand, int id, String model, int year, double pricePerDay,double insuranceFee) {
        super(brand, id, model, year, pricePerDay);
        this.insuranceFee = insuranceFee;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public int getMinDays() {
        return minDays;
    }

    @Override
    public void display() {
        System.out.println("ID: " + getId());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Price Per Day: " + getPricePerDay());
        System.out.println("insurance Fee: " + getInsuranceFee());
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
        System.out.println("----------------------------------");
    }

}
