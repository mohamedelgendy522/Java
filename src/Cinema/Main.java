package Cinema;

import java.util.Scanner;

public class Main {
    static int[]  countSeats (char[][] arr){
        int countAvailable = 0 ,countBooked = 0 ;
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 6 ; j++){
                if(arr[i][j] == 'O'){
                    countAvailable++;
                }
                else {
                    countBooked++;
                }
            }
        }
        return new int[]{countAvailable, countBooked};
    }
    static void Initialize(char[][] arr){
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 6 ; j++){
                arr[i][j]='O';
            }
            System.out.println();
        }
    }


    static void displaySeats(char[][] arr){
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 6 ; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }


    static boolean bookSeat(char[][] arr,int row , int col){
        if(arr[row][col] == 'O'){
            arr[row][col] = 'X';
            return true;
        }
        else{
            return false;
        }
    }


    static void printMovies(String[] movies){
        for(int i = 0 ; i< movies.length ;i++){
            System.out.println((i+1)+". "+movies[i]);
        }
    }

    static boolean cancelBooking(char[][] arr,int row , int col){
        if(arr[row][col] == 'O'){
            return false;
        }
        else{
            arr[row][col] = 'O';
            return true;
        }
    }

    static int validValue(String type ,Scanner sc){
        if(type.equals("ROW")){
            while (true){
                System.out.println("Enter row Valid values from 1 to 5");
                int row = sc.nextInt();
                if(row >= 1 && row <= 5){
                    return row - 1;
                }
                else{
                    System.out.println("Invalid value");
                }
            }
        }
        else{
            while (true){
                System.out.println("Enter row Valid values from 1 to 6");
                int col = sc.nextInt();
                if(col >= 1 && col <= 6){
                    return col - 1;
                }
                else{
                    System.out.println("Invalid value");
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] seats = new char[5][6];
        String[] movieNames = {"Superman","Avatar","Minecraft","Inside Out","F1"};
        Initialize(seats);
        while (true) {
            System.out.println("\n========== Cinema Ticket Booking ==========");
            System.out.println("1. Display Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Show all movies");
            System.out.println("5. Show number of available and booked seats");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    displaySeats(seats);
                    break;
                case 2:
                    while (true) {
                        System.out.println("Enter Your Seat");
                        int row = validValue("ROW",sc),col = validValue("COL",sc);
                        if(bookSeat(seats, row,col)){
                            System.out.println("Ticket booked");
                            break;
                        }
                        else{
                            System.out.println("This Ticket is already booked");
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println("Enter Your Seat want to cancel");
                        int row = validValue("ROW", sc), col = validValue("COL", sc);
                        if(cancelBooking(seats,row,col)){
                            System.out.println("Seat Cancled");
                            break;
                        }
                        else {
                            System.out.println("Is already unbooked");
                        }
                    }
                    break;

                case 4:
                    printMovies(movieNames);
                    break;

                case 5:
                    int[] count = countSeats(seats);
                    System.out.println("No. of Available Seats " + count[0]);
                    System.out.print("No. of Booked seats "+ count[1]);
                    break;
                case 0:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            if (choice == 0) {
                break;
            }
        }
    }
}
