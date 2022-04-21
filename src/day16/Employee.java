package day16;

import java.util.Calendar;

public class Employee {

    private String name;
    private int age;
    private float salary;


    public Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public  float getSalary() {
        return salary;
    }
}
