public class CashPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Payment made by cash: $" + amount);
    }
}
