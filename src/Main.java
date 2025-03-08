//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Order firstOrder=new Order("Mobile Phone",2);
        InvoicePrinter printer=new InvoicePrinter();

        firstOrder.processOrder();
        printer.printInvoice(firstOrder);
    }
}