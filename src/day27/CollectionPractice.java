package day27;

import day19.Employee;

import java.time.LocalDate;
import java.util.*;
import java.util.logging.Logger;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(2);
        integers.add(8);
        integers.add(2);
        integers.add(4);

        Logger.getGlobal().info(integers.toString());

        Set<Integer> integersSet = new HashSet<>();
        integersSet.add(2);
        integersSet.add(2);
        integersSet.add(8);
        integersSet.add(2);
        integersSet.add(4);

        Logger.getGlobal().info(integersSet.toString());


        Set<Integer> integersTreeSet = new TreeSet<>();
        integersTreeSet.add(2);
        integersTreeSet.add(2);
        integersTreeSet.add(8);
        integersTreeSet.add(2);
        integersTreeSet.add(4);

        Logger.getGlobal().info(integersTreeSet.toString());


        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(new Employee("ABC", 2000, LocalDate.now()));
        employees.add(new Employee("ABC", 2000, LocalDate.now()));
        employees.add(new Employee("DEF", 5000, LocalDate.now()));
        employees.add(new Employee("IJK", 5000, LocalDate.now()));
        employees.add(new Employee("LMN", 5000, LocalDate.now()));

        Logger.getGlobal().info(employees.toString());
    }
}
