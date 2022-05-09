package day26;

import day19.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Logger;

public class IteratorPractice {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("ABC", 2000, LocalDate.now()));
        employees.add(new Employee("DEF", 5000, LocalDate.now()));
        employees.add(new Employee("IJK", 5000, LocalDate.now()));
        employees.add(new Employee("LMN", 5000, LocalDate.now()));


        System.out.println(employees.size());
        System.out.println(employees.isEmpty());

        boolean isEmployeeInTheList = employees.contains(new Employee("ABC", 2000, LocalDate.now()));
        System.out.println(isEmployeeInTheList);



        for (int i = 0; i < employees.size() ; i++) {
            Employee employee = employees.get(i);

        }

        for (Employee employee : employees) {

        }

        Iterator<Employee> iterator = employees.iterator();
        iterator.next();
        iterator.remove();
        iterator.next();
        iterator.remove();
        while (iterator.hasNext()){
            Employee employee =  iterator.next();
            iterator.remove();
//           Logger.getGlobal().info(employee.toString());
        }

        System.out.println(employees);
    }
}
