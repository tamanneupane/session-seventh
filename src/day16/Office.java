package day16;

import java.util.Calendar;

public class Office {

    public static void main(String[] args) {
        Employee employee =  new Employee("ABC", 30, 5000);

        Employee boss = new Manager("DEF", 35, 8000, 4000);

        Employee executive = new Executive("GHI", 35, 8000, 1000, 1000);

        boss.getName();
        System.out.println(employee.getSalary());
        System.out.println(boss.getSalary());
        System.out.println(executive.getSalary());


        Employee[] employees = new Employee[3];
        employees[0] = employee;
        employees[1] = boss;
        employees[2] = executive;

        System.out.println(employees[0].getSalary());
        System.out.println(employees[1].getSalary());
        System.out.println(employees[2].getSalary());

        if(employees[1] instanceof Manager){
            System.out.println(((Manager)employees[1]).getBonus());
        }

    }
}
