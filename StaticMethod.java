public class StaticMethod {

    interface Payment {

        void pay();

        static void paymentInfo() {
            System.out.println("This application supports multiple payment methods");
        }
    }

    static class UPIPayment implements Payment {

        @Override
        public void pay() {
            System.out.println("Payment made using UPI");
        }
    }

    public static void main(String[] args) {

        UPIPayment payment = new UPIPayment();

        payment.pay();

        Payment.paymentInfo();
    }
}