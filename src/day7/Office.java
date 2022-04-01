package day7;

import java.util.Calendar;
import java.util.Date;

public class Office {

//    var i = 3; // Not be able to use var outside the function

    public static void main(String[] args) {

//        Employee employee = new Employee();

        var i = 3;

        Employee taman = new Employee("Taman", 30, 5000, Calendar.getInstance());
        System.out.println(taman.getName());
        System.out.println(taman.getAge());
        System.out.println(taman.getSalary());
        System.out.println(taman.getSalary());

        Employee abc = new Employee("ABC", 28, 6000, Calendar.getInstance(), "275680");
        System.out.println(abc.getName());
        System.out.println(abc.getAge());
        System.out.println(abc.getSalary());
        System.out.println(abc.getSalary());



    }
}
