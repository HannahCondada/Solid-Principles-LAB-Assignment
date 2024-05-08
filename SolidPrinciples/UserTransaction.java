package SolidPrinciples;

public class UserTransaction {

    public static void main(String[] args) {

        TotalCalculator totalCalculator = new OrderDetails();
        totalCalculator.calculateTotal(10.0, 2);

        OrderPlacement order = new OrderDetails();
        order.placeOrder("John Doe", "123 Main St");

        InvoiceGenerator invoice = new OrderDetails();
        invoice.generateInvoice("order_123.pdf");

        EmailNotification notifier = new OrderDetails();
        notifier.sendEmailNotification("johndoe@example.com");

    }
}
