package practise;

public abstract class Payment {
    double amount;
    double sale;

    public Payment(double amount, double sale) {
        this.amount = amount;
        this.sale = sale;
    }

    abstract public void pay(double amount);
}
