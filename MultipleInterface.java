public class MultipleInterface {

    interface Camera {
        void takePhoto();
    }

    interface Phone {
        void makeCall();
    }

    static class Smartphone implements Camera, Phone {

        @Override
        public void takePhoto() {
            System.out.println("Smartphone is taking a photo");
        }

        @Override
        public void makeCall() {
            System.out.println("Smartphone is making a call");
        }
    }

    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone();

        smartphone.takePhoto();
        smartphone.makeCall();
    }
}