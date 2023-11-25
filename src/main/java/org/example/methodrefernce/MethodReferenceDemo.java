package org.example.methodrefernce;

import org.example.constructor.ConstructorReferenceDemo;
import org.example.entity.Employee;
import org.example.instance.InstanceMethodDemo;
import org.example.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        EmployeeService.getEmployees();

       // ClassName::methodName static method reference

        //annonyms function call
        EmployeeService.getEmployees()
                .forEach(new Consumer<Employee>() {
                    @Override
                    public void accept(Employee employee) {
                        System.out.println(employee);
                    }
                });

        System.out.println("..................................................");

  //lambda call
        EmployeeService.getEmployees()
                .forEach( ( employee)->{System.out.println(employee);});

        System.out.println("....................................");

   //Static method reference
        EmployeeService.getEmployees()
                .forEach(System.out::println);
        System.out.println("....................................");
//instance method reference
        InstanceMethodDemo      demo = new InstanceMethodDemo();
        EmployeeService.getEmployees()
                .forEach(demo::printTest);

        //constructor  reference
        //reference :: new
        //ClassName ::new

        //lambda
        ConstructorReferenceDemo demo1 = ()->new Employee();
        String name  =demo1.getEmployee().getName();
        System.out.println(name);

        //constructor reference
        ConstructorReferenceDemo demo2 = Employee::new;
        String name1  =demo2.getEmployee().getName();
        System.out.println(name1);

        //another example of constructor reference

    List<Object> al;
        al = EmployeeService.getEmployees()
                    .stream()
                    .map(Employee::getId).map(ArrayList ::new)
                    .collect(Collectors.toList());
        System.out.println(al);








    }
}
