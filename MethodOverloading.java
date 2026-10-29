public class MethodOverloading {

    static class BonusCalculator {

        int calculateBonus(int salary) {
            return salary * 10 / 100;
        }

        int calculateBonus(int salary, int rating) {
            return salary * rating / 100;
        }

        double calculateBonus(double salary) {
            return salary * 0.15;
        }
    }

    public static void main(String[] args) {

        BonusCalculator calculator = new BonusCalculator();

        System.out.println(calculator.calculateBonus(30000));
        System.out.println(calculator.calculateBonus(30000, 5));
        System.out.println(calculator.calculateBonus(30000.0));
    }
}