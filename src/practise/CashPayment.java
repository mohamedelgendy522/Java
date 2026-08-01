package practise;

public class CashPayment extends Payment{
    public CashPayment(double amount, double sale) {
        super(amount, sale);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in cash.");
    }
}
