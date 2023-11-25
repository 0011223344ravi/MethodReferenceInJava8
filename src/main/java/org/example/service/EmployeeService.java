package org.example.service;

import org.example.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {




    public static  List<Employee> getEmployees() {
        List<Employee> employees   = new ArrayList<>();

        Employee employee1  = new Employee(1,"Ravi", 25,"Delhi");
        Employee employee2  = new Employee(2,"Aman", 25,"Noida");
        Employee employee3  = new Employee(3,"Vivek", 25,"Bangalore");
        Employee employee4  = new Employee(4,"Amit", 25,"Bhopal");
        Employee employee5  = new Employee(5,"Junaid", 25,"Hydrabad");
        Employee employee6  = new Employee(6,"Tadu", 25,"Delhi");



        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        return employees;
    }
}
