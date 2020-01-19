package pl.CollectionsExcersises;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PensionAnalyzerApp {
    public static void main(String[] args) {

        Employee kristoff = new Employee("Kristof", "123", 15000);
        Employee kasia = new Employee("Kasia", "324", 25000);
        Employee grazynka = new Employee("Grażynka", "456", 3500);
        Employee karol = new Employee("Karol", "433", 13000);
        Employee zbigniew = new Employee("Zbigniew", "555", 13000);
        Employee joanna = new Employee("Joanna", "322", 1500);
        Employee aziz = new Employee("Aziz", "333", 4999);

        List<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(kristoff);
        allEmployees.add(kasia);
        allEmployees.add(grazynka);
        allEmployees.add(karol);
        allEmployees.add(zbigniew);
        allEmployees.add(joanna);
        allEmployees.add(aziz);

        List<Employee> employeeToFire = new ArrayList<>();
        for (Employee singleEmployee : allEmployees) {
            if (singleEmployee.getSalary() < 10000) {
                employeeToFire.add(singleEmployee);
            }
            System.out.println("List of employees to fire: ");
            for (Employee singleEmployeeToFire : employeeToFire) {
                System.out.println(singleEmployeeToFire);
            }
        }

        System.out.println("This is chosen employee to fire: ");
        System.out.println(chooseEmployeeToFire(employeeToFire));
    }

    public static Employee chooseEmployeeToFire(List<Employee> employeeToFire) {
        Random random = new Random();
        int randomInt = random.nextInt(employeeToFire.size());
        return employeeToFire.get(randomInt);
    }

}

