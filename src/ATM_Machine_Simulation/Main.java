package ATM_Machine_Simulation;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte steps = 0;

        System.out.println(" Enter 4 digits For newPin ");
        String newPin,enterPin;
        boolean isLogin = false;
        newPin = sc.next();
        if(newPin.length() != 4){
            System.out.println("Your Password must be 4 digits");
        }
        else {
            System.out.println("Enter your Pin");

            do {
                enterPin = sc.next();
                if (enterPin.equals(newPin)) {
                    System.out.println("successfully logged in");
                    isLogin = true;
                    break;
                } else {
                    System.out.println("Your Pin is Wrong");
                }
                steps++;
            } while (!isLogin && steps < 3);

            if (isLogin) {
                double currentBalance = 2500;
                byte successfulTransactions = 0;
                boolean usingApp = true;
                while (usingApp) {
                    System.out.println("============== ATM ==============");
                    System.out.println("1. Check Balance" + "\n" + "2. Deposit" + "\n" +
                            "3. Withdraw" + "\n" +
                            "4. Show Account Status" + "\n" + "5. Exit");
                    byte chooseYourStep;
                    chooseYourStep = sc.nextByte();
                    switch (chooseYourStep) {
                        case 1:
                            if (currentBalance == 0) {
                                System.out.println("Warning: Your account is empty.");
                            }
                            System.out.println("Your Current Balance : " + currentBalance);
                            break;
                        case 2:
                            double Deposit;
                            System.out.print("Please enter the Deposit amount: ");
                            Deposit = sc.nextDouble();
                            if (Deposit > 0) {
                                successfulTransactions++;
                                currentBalance += Deposit;
                                System.out.println("Your Current Balance : " + currentBalance);
                            } else {
                                System.out.println("Invalid amount.");
                            }
                            break;
                        case 3:
                            double withDraw;
                            System.out.print("Please enter the withdrawal amount: ");
                            withDraw = sc.nextDouble();
                            if (withDraw == 0) {
                                System.out.println("Transaction cancelled.");
                            } else if (withDraw <= currentBalance && withDraw > 0) {
                                successfulTransactions++;
                                currentBalance -= withDraw;
                                if (currentBalance == 0) {
                                    System.out.println("Warning: Your account is empty.");
                                }
                                System.out.println("Your Current Balance : " + currentBalance);
                            } else {
                                System.out.println("Insufficient balance.");
                            }
                            break;
                        case 4:
                            if (currentBalance >= 5000) {
                                System.out.println("VIP Customer");
                            } else if (currentBalance >= 1000 && currentBalance < 5000) {
                                System.out.println("Regular Customer");
                            } else {
                                System.out.println("Low Balance");
                            }
                            break;
                        case 5:
                            System.out.println("Thank you for using our ATM!");
                            System.out.println("Successful Transactions: " + successfulTransactions);
                            usingApp = false;
                            break;
                        default:
                            System.out.println("Invalid option Choose from 1 to 5");
                    }
                }
            } else {
                System.out.println("Maximum PIN attempts reached. Access denied.");
            }
        }
    }
}
