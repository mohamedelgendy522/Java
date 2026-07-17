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
                } else {
                    System.out.println("Your Pin is Wrong");
                }
                steps++;
            } while (!isLogin && steps < 3);

            if (isLogin) {
                double currentBalance = 5000;
                byte successfulTransactions = 0;
                boolean usingApp = true;
                while (usingApp) {
                    System.out.println("============== BANK ==============");
                    System.out.println("1. Check Balance" + "\n" + "2. Deposit" + "\n" +
                            "3. Withdraw" + "\n" +
                            "4. Transfer" + "\n" + "5. Exit");
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
                            double transfer;
                            String useraccount;
                            System.out.print("Please enter the transfer amount: ");
                            transfer = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Enter useraccount u want to transfer to him");
                            useraccount = sc.nextLine();
                            if (transfer == 0) {
                                System.out.println("Transaction cancelled.");
                            } else if (transfer <= currentBalance && transfer > 0) {
                                successfulTransactions++;
                                currentBalance -= transfer;
                                if (currentBalance == 0) {
                                    System.out.println("Warning: Your account is empty.");
                                }
                                System.out.println("Your Current Balance : " + currentBalance);
                            } else {
                                System.out.println("Insufficient balance.");
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
        runAtmWorkflow(sc);
    }
}
