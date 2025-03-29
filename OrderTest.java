public class OrderTest {
    public static void main(String[] args) {
        OrderCalculator orderCalculator = new CalculatorAction();
        OrderPlacement orderPlacement = new PlacementAction();
        OrderInvoice orderInvoice = new InvoiceAction();
        Order order = new Order(orderCalculator, orderPlacement, orderInvoice);

        System.out.println("ORDER DETAILS");
        order.orderWithoutInvoice("John Doe", "123 Main St", 10, 2);

        System.out.println("\nORDER INVOICE");
        order.orderWithInvoice("order_123.pdf", "johndoe@example.com");
    }
}