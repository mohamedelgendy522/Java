package practise;

public class WalletPayment extends Payment{
    public WalletPayment(double amount, double sale) {
        super(amount, sale);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in Wallet");
    }
}
