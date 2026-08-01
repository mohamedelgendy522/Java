package Car_Rental_Management_System;

import java.util.Scanner;

public class Main {

    static double officeIncome = 0;
    static final int maxCars = 20;
    static final int maxCustomers = 20;

    static int UniqueIdCar(Car[] cars, Scanner sc) {
        while (true) {
            System.out.print("Enter a unique car ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (Car.isUniqueId(cars, id)) {
                return id;
            } else {
                System.out.println("This ID is already in use. Please enter a different ID");
            }
        }
    }

    static int UniqueIdCustomer(Customer[] customers, Scanner sc) {
        while (true) {
            System.out.print("Enter a unique Customer ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (Customer.isUniqueId(customers, id)) {
                return id;
            } else {
                System.out.println("This ID is already in use. Please enter a different ID");
            }
        }
    }

    static int validationManufacturingYear(Scanner sc) {
        while (true) {
            System.out.print("Enter the manufacturing year (1990-2026): ");
            int year = sc.nextInt();

            if (year >= 1990 && year <= 2026) {
                return year;
            } else {
                System.out.println("Invalid year. Please enter a year between 1990 and 2026");
            }
        }
    }

    static double validationPricePerDay(Scanner sc) {
        while (true) {
            System.out.print("Enter rental price per day: ");
            double price = sc.nextDouble();

            if (price > 0) {
                return price;
            } else {
                System.out.println("Invalid price. Please enter a value greater than 0");
            }
        }
    }

    static double validationInsuranceFees(Scanner sc) {
        while (true) {
            System.out.print("Enter insurance fees (0 or greater): ");
            double insuranceFees = sc.nextDouble();

            if (insuranceFees >= 0) {
                return insuranceFees;
            } else {
                System.out.println("Invalid insurance fees. Please try again");
            }
        }
    }

    static void searchById(Car[] cars , Scanner sc){
        System.out.print("Enter the car ID you want to search for: ");
        int id = sc.nextInt();
        Car.searchById(cars,id);
    }

    static void searchByBrand(Car[] cars , Scanner sc){
        System.out.print("Enter the car Brand you want to search for: ");
        String brand = sc.nextLine();
        Car.searchByBrand(cars,brand);
    }

    static void addRegularCar(Car[] cars, Scanner sc) {
        if (Car.getCount() == maxCars) {
            System.out.println("Cannot add more cars. The garage is full");
            return;
        }

        int id = UniqueIdCar(cars, sc);

        System.out.print("Enter car brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter car model: ");
        String model = sc.nextLine();

        System.out.print("Enter car priceperday: ");
        double pricePerDay = validationPricePerDay(sc);

        int year = validationManufacturingYear(sc);
        Car cr = new Car(brand,id, model, year, pricePerDay);

        cars[Car.getCount() - 1] = cr;
    }


    static void addLuxuryCar(Car[] cars,Scanner sc){
        if (Car.getCount() == maxCars) {
            System.out.println("Cannot add more cars. The garage is full");
            return;
        }

        int id = UniqueIdCar(cars, sc);

        System.out.print("Enter car brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter car model: ");
        String model = sc.nextLine();

        System.out.print("Enter Price per Day: ");
        double pricePerDay = validationPricePerDay(sc);

        int year = validationManufacturingYear(sc);

        double insurancefFee = validationInsuranceFees(sc);

        LuxuryCar cr = new LuxuryCar(brand,id,model,year,pricePerDay,insurancefFee);
        cars[Car.getCount() - 1] = cr;
    }


    static void addCustomer(Customer[] customers , Scanner sc){
        if(Customer.getCount() == maxCustomers){
            System.out.println("Cannot add more Customers");
            return;
        }

        int id = UniqueIdCustomer(customers, sc);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter customer phone: ");
        String phone = sc.nextLine();

        Customer cs = new Customer(phone,name,id);

        customers[Customer.getCount() - 1 ] = cs;
    }

    static void returnCar(Customer[] customers, Car[] cars, Scanner sc) {

        System.out.print("Enter Customer ID: ");
        int customerId = sc.nextInt();

        Customer customer = Customer.getCustomer(customers, customerId);

        if (customer == null) {
            System.out.println("Customer not found");
            return;
        }

        if (customer.getRentedCarId() == -1) {
            System.out.println("This customer didn't rent any car");
            return;
        }

        Car car = Car.getCar(cars, customer.getRentedCarId());

        customer.setRentedCarId(-1);
        customer.setNumberOfRentedDays(0);

        if (car != null) {
            car.setAvailable(true);
            System.out.println("Car returned successfully: " + car.getBrand() + " " + car.getModel());
        } else {
            System.out.println("Car returned successfully");
        }
    }

    static void rentCar(Customer[] customers, Car[] cars, Scanner sc) {

        System.out.print("Enter Customer ID: ");
        int customerId = sc.nextInt();

        Customer customer = Customer.getCustomer(customers, customerId);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        if (customer.getRentedCarId() != -1) {
            System.out.println("Customer already rented car ID: " + customer.getRentedCarId());
            return;
        }

        System.out.print("Enter Car ID: ");
        int carId = sc.nextInt();

        Car car = Car.getCar(cars, carId);

        if (car == null) {
            System.out.println("Car not found.");
            return;
        }

        if (!car.isAvailable()) {
            System.out.println("Car is already rented.");
            return;
        }

        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        if (days <= 0) {
            System.out.println("Number of days must be greater than zero.");
            return;
        }

        if (car instanceof LuxuryCar) {
            if (days < ((LuxuryCar) car).getMinDays()) {
                System.out.println("Luxury cars require at least " + ((LuxuryCar) car).getMinDays() + " rental days.");
                return;
            }
        }

        double cost = car.getPricePerDay() * days;

        if (car instanceof LuxuryCar) {
            cost += ((LuxuryCar) car).getInsuranceFee();
        }

        cost += cost * car.getTaxRate();

        car.setAvailable(false);

        customer.setRentedCarId(car.getId());
        customer.setNumberOfRentedDays(days);
        customer.setTotalPaid(customer.getTotalPaid() + cost);

        officeIncome += cost;

        System.out.println("\n===== RENT RECEIPT =====");
        System.out.println("Customer : " + customer.getName());
        System.out.println("Car      : " + car.getBrand() + " " + car.getModel());
        System.out.println("Days     : " + days);
        System.out.println("Total    : " + cost);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] cars = new Car[maxCars];
        Customer[] customers = new Customer[maxCustomers];

        int choice;
        boolean running = true;

        while (running) {

            System.out.println("\n========================================");
            System.out.println("       SPEEDWAY RENTALS SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Regular Car");
            System.out.println("2. Add Luxury Car");
            System.out.println("3. Add Customer");
            System.out.println("4. Display All Cars");
            System.out.println("5. Display Available Cars");
            System.out.println("6. Rent a Car");
            System.out.println("7. Return a Car");
            System.out.println("8. Search Car by ID");
            System.out.println("9. Search Car by Brand");
            System.out.println("10. Display All Customers");
            System.out.println("0. Exit");
            System.out.println("========================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addRegularCar(cars,sc);
                    break;

                case 2:
                    addLuxuryCar(cars,sc);
                    break;

                case 3:
                    addCustomer(customers,sc);
                    break;

                case 4:
                    Car.displayAll(cars);
                    break;

                case 5:
                    Car.displayAvailable(cars);
                    break;

                case 6:
                    rentCar(customers,cars,sc);
                    break;

                case 7:
                    returnCar(customers,cars,sc);
                    break;

                case 8:
                    searchById(cars,sc);
                    break;

                case 9:
                    searchByBrand(cars,sc);
                    break;

                case 10:
                    Customer.displayAll(customers,cars);
                    break;

                case 11:
                    System.out.println("Total Income : " + officeIncome);
                    Car.displayStatistics(cars);
                    break;
                case 0:
                    System.out.println("Total Cars      : " + Car.getCount());
                    System.out.println("Total Customers : " + Customer.getCount());
                    System.out.println("Total Income    : " + officeIncome);
                    System.out.println("\nThank you for using Speedway Rentals System!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}