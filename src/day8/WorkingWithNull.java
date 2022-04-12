package day8;

import java.util.Calendar;
import java.util.Objects;

public class WorkingWithNull {

    public static void main(String[] args) {

       Employee employee = new Employee("Taman", 32, 5000, Calendar.getInstance());

       String name = Objects.requireNonNullElse(employee.getName(),"N/A");
       String uName = name.toUpperCase();
       System.out.println(uName);

       Calendar hireDate = Objects.requireNonNullElse(employee.getHireDate(), Calendar.getInstance());
       String sHireDate = hireDate.toString();
       System.out.println(sHireDate);


//       System.out.println(employee.getName());
//       System.out.println(employee.getHireDate());

    }
}
