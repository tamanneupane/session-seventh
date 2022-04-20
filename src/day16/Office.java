package day16;

public class Office {

    public static void main(String[] args) {
        Employee employee = new Employee("ABC", 30, 5000);

        Manager boss = new Manager("DEF", 35, 8000, 1000);

        Executive executive = new Executive("GHI", 35, 8000, 1000, 1000);

        System.out.println(employee.getSalary());
        System.out.println(boss.getSalary());
        System.out.println(executive.getSalary());

    }
}
