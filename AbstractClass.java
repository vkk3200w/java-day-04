public class AbstractClass {

    abstract static class Payment {

        abstract void processPayment();

        void paymentStatus() {
            System.out.println("Payment processing started");
        }
    }

    static class CreditCardPayment extends Payment {

        @Override
        void processPayment() {
            System.out.println("Processing payment using Credit Card");
        }
    }

    static class UPIPayment extends Payment {

        @Override
        void processPayment() {
            System.out.println("Processing payment using UPI");
        }
    }

    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UPIPayment();

        payment1.paymentStatus();
        payment1.processPayment();

        payment2.paymentStatus();
        payment2.processPayment();
    }
}