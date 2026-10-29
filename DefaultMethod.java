public class DefaultMethod {

    interface Payment {

        void pay();

        default void paymentStatus() {
            System.out.println("Payment is being processed");
        }
    }

    static class CreditCardPayment implements Payment {

        @Override
        public void pay() {
            System.out.println("Payment made using Credit Card");
        }
    }

    public static void main(String[] args) {

        CreditCardPayment payment = new CreditCardPayment();

        payment.pay();
        payment.paymentStatus();
    }
}