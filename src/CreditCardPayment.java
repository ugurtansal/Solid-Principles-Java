public class CreditCardPayment implements  PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Payment made by credit card: $" + amount);
    }
}
