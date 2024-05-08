package SolidPrinciples;

public class OrderDetails implements TotalCalculator, OrderPlacement, InvoiceGenerator, EmailNotification {
    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }

    @Override
    public void generateInvoice(String invoice) {
        System.out.println("Invoice generated: " + invoice);
    }

    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
    }

    @Override
    public void calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }
}
