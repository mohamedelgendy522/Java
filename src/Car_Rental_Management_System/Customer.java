package Car_Rental_Management_System;

public class Customer {
    private int id;
    private String name;
    private String phone;
    private int rentedCarId;
    private int numberOfRentedDays;
    private double totalPaid;
    private static int count = 0;

    public Customer(String phone, String name, int id) {
        this.totalPaid = 0;
        this.numberOfRentedDays = 0;
        this.rentedCarId = -1 ;
        this.phone = phone;
        this.name = name;
        this.id = id;
        count++;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getRentedCarId() {
        return rentedCarId;
    }

    public void setRentedCarId(int rentedCarId) {
        this.rentedCarId = rentedCarId;
    }

    public int getNumberOfRentedDays() {
        return numberOfRentedDays;
    }

    public void setNumberOfRentedDays(int numberOfRentedDays) {
        this.numberOfRentedDays = numberOfRentedDays;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    public static boolean isUniqueId(Customer[] customers , int id){
        for (int i = 0 ; i < count ; i++){
            if(customers[i].id == id){
                return false;
            }
        }
        return true;
    }
    public static Customer getCustomer(Customer[] customers,int id){
        for (int i = 0 ; i < count ; i++){
            if (customers[i].id == id){
                return customers[i];
            }
        }
        return null;
    }

    public void display(Car[] cars){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);

        Car rentedCar = Car.getCar(cars, rentedCarId);
        if (rentedCar != null) {
            System.out.println("Rented Car: " + rentedCar.getBrand() + " " + rentedCar.getModel());
        } else {
            System.out.println("Rented Car: None");
        }

        System.out.println("numberOfRentedDays: " + numberOfRentedDays);
        System.out.println("total paid: " + totalPaid);
        System.out.println("----------------------------------");
    }

    public static void displayAll(Customer[] customers,Car[] cars){
        for (int i = 0 ; i < Customer.getCount() ; i++){
            customers[i].display(cars);
        }
    }
}
