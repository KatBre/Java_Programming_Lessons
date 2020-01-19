package pl.CollectionsExcersises;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Employee {
    private String name;
    private String peselNumber;
    private int salary;

    public Employee(String name, String peselNumber, int salary) {
        this.name = name;
        this.peselNumber = peselNumber;
        this.salary = salary;
    }

    public void giveRaise(int amount) {
        salary = salary + amount;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", peselNumber='" + peselNumber + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                Objects.equals(name, employee.name) &&
                Objects.equals(peselNumber, employee.peselNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, peselNumber, salary);
    }








}




