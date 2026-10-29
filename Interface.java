public class Interface {

    interface Payment {
        void pay();
    }

    static class CreditCardPayment implements Payment {

        @Override
        public void pay() {
            System.out.println("Payment made using Credit Card");
        }
    }

    static class UPIPayment implements Payment {

        @Override
        public void pay() {
            System.out.println("Payment made using UPI");
        }
    }

    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UPIPayment();

        payment1.pay();
        payment2.pay();
    }
}