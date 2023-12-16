package org.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();
        Employee employee1 = new Employee(1001, "20-20-20", "Ivan", 1);
        Employee employee2 = new Employee(1002, "20-20-21", "Maxim", 2);
        Employee employee3 = new Employee(1003, "20-20-22", "Denis", 3);
        Employee employee4 = new Employee(1004, "20-20-23", "Boris", 4);
        Employee employee5 = new Employee(1005, "20-20-24", "Roman", 5);
        directory.addEmployee(employee1);
        directory.addEmployee(employee2);
        directory.addEmployee(employee3);
        directory.addEmployee(employee4);
        directory.addEmployee(employee5);
        System.out.println("Employees with experience 3: ");
        List<Employee> employeesWithExperience3 = directory.findEmployeesByExperience(3);
        for (Employee employee: employeesWithExperience3){
            System.out.println(employee.getName());
        }
        System.out.println("Phone numbers of employees named Denis: ");
        List<String> phoneNumbersOfDenis = directory.findPhoneNumbersByName("Denis");
        for (String phoneNumber: phoneNumbersOfDenis){
            System.out.println(phoneNumber);
        }
        System.out.println("Employee with ID 1004: ");
        Employee employeeById1004 = directory.findEmployeeByEmployeeId(1004);
        System.out.println(employeeById1004.getName());



    }
    private List<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> findEmployeesByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<String> findPhoneNumbersByName(String name) {
        List<String> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                result.add(employee.getPhoneNumber());
            }
        }
        return result;
    }

    public Employee findEmployeeByEmployeeId(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    // Геттеры и сеттеры для коллекции employees
}

class Employee {
    public int getEmployeeId() {
        return employeeId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    private int employeeId;

    public Employee(int employeeId, String phoneNumber, String name, int experience) {
        this.employeeId = employeeId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    private String phoneNumber;
    private String name;
    private int experience;

    // Конструктор, геттеры и сеттеры для атрибутов
}


