public interface OrderInvoice {
    void generateInvoice(String fileName);
    void sendEmailNotification(String email);
}