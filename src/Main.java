public class Main {
    public static void main(String[] args) {

        PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment();

        PaymentFactory bankTransferFactory = new BankTransferPaymentFactory();
        Payment BankTransferPayment = bankTransferFactory.createPayment();
        BankTransferPayment.processPayment();
    }
}