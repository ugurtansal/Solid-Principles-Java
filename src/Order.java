public class Order {
    private String product;
    private int quantity;

    public Order(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void processOrder() {
        System.out.println("Order is added: " + product + " x " + quantity);
    }
}
