public class MethodOverriding{

    static class Employee {
        void work() {
            System.out.println("Employee is working");
        }
    }

    static class Developer extends Employee {
        @Override
        void work() {
            System.out.println("Developer is writing code");
        }
    }

    static class Tester extends Employee {
        @Override
        void work() {
            System.out.println("Tester is testing applications");
        }
    }

    public static void main(String[] args) {

        Employee employee1 = new Developer();
        Employee employee2 = new Tester();

        employee1.work();
        employee2.work();
    }
}