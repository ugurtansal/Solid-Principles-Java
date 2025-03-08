public class CreditCardPayment implements  RefundablePayment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment made by credit card: $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund by credit card: $" + amount);
    }
}
