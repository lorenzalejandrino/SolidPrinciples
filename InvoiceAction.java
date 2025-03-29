public class InvoiceAction implements OrderInvoice {
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }

    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}