package day8;


import java.util.Calendar;


public class ImplicitAndExplicitParameter {

    public static void main(String[] args) {

        Employee taman = new Employee("Taman Neupane", 30, 5000, Calendar.getInstance());
        Employee abc = new Employee("ABC", 28, 6000, Calendar.getInstance(), "275680");

//        taman.setEmployeeCount(10);

        int a = 20;

        Employee.setEmployeeCount(a);



        System.out.println(Employee.getEmployeeCount());

//        taman.fireEmployee();

    }
}
