package practise;

public class CreditPayment extends Payment {
    public CreditPayment(double amount, double sale) {
        super(amount, sale);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in Visa");
    }
}
