package day19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();

        strings.ensureCapacity(100);

        strings.add("ABC");
        strings.add("DEF");

       System.out.println(strings.toString());

       strings.add(0, "Taman");

        System.out.println(strings.toString());

        strings.set(1, "IJK");

        System.out.println(strings.toString());

//       strings.remove("Taman");
//
//        System.out.println(strings.toString());
//
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ABC", 2000, LocalDate.now()));
        employees.add(new Employee("DEF", 5000, LocalDate.now()));
        employees.add(new Employee("IJK", 5000, LocalDate.now()));
        employees.add(new Employee("LMN", 5000, LocalDate.now()));

        System.out.println(employees.get(3));



//        employees.remove(new Employee("ABC", 2000, LocalDate.now()));

//        ArrayList<Employee> employeesToBeRemoved = new ArrayList<>();
//        employeesToBeRemoved.add(new Employee("DEF", 5000, LocalDate.now()));
//        employeesToBeRemoved.add(new Employee("LMN", 5000, LocalDate.now()));
//
//        employees.removeAll(employeesToBeRemoved);
//
//        System.out.println(employees);



//        System.out.println(employees.isEmpty());
//
//        employees.clear();
//
//        System.out.println(employees.isEmpty());
    }
}
