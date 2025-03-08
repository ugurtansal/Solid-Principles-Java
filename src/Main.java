//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //First Principle
        System.out.println("\n First Principle --------------------------");
        Order firstOrder=new Order("Mobile Phone",2);
        InvoicePrinter printer=new InvoicePrinter();
        firstOrder.processOrder();
        printer.printInvoice(firstOrder);

        System.out.println("\n Second Principle --------------------------");
        //Second Principle
        CreditCardPayment credCard=new CreditCardPayment();
        PaymentMethod payPal=new PayPalPayment();
        PaymentMethod cash= new CashPayment();
        credCard.pay(55.99);
        payPal.pay(98.75);
        cash.pay(65.55);

        System.out.println("\n Third Principle --------------------------");
        //Third Principle
        PaymentProcessor payProcess=new PaymentProcessor();
        payProcess.processPayment(cash,56.65);
        payProcess.processPayment(payPal,56.65);
        payProcess.processPayment(credCard,56.65);


        //Fourth Principle

        System.out.println("\n Fourth Principle --------------------------");
        credCard.refund(55.99);

        //Fifth Principle
        System.out.println("\n Fifth Principle --------------------------");
        OrderService orderService = new OrderService(payPal);
        orderService.checkout(198.99);







    }
}