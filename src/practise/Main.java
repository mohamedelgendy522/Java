package practise;
import Student_Management_System.Student;

import javax.management.relation.Role;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Payment P1 = new CashPayment(1500.50,50);
        Payment P2 = new CreditPayment(1500.50,50);
        Payment P3 = new WalletPayment(1500.50,50);
    }
}
