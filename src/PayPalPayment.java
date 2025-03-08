public class PayPalPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Payment made by PayPal: $" + amount);
    }
}
