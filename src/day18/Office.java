package day18;

import java.time.LocalDate;

public class Office {

    public static void main(String[] args) {
        Employee employee1 = new Employee("ABC", 4000, LocalDate.now());
        Employee employee2 = new Employee("ABC", 4000, LocalDate.now());

//        employee.toString();


        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        boolean isEqual = employee1 == employee2; // false, false
        boolean isEqual1 = employee1.equals(employee2); // false , true(after overriding equals and hashcode method)

        System.out.println(isEqual); // true , true , false , true
        System.out.println(isEqual1); // true , true , true , false

    }
}
