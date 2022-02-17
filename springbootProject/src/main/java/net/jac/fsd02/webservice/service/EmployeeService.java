package net.jac.fsd02.webservice.service;

import net.jac.fsd02.webservice.model.Address;
import net.jac.fsd02.webservice.model.Employee;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeService {
    static List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee(1, "Allen", new Address(100, "apple")));
        employees.add(new Employee(2, "Allen", new Address(200, "banana")));
        employees.add(new Employee(3, "Allen", new Address(300, "citron")));
    }

    public List<Employee> getAllEmployee() {
        return employees;
    }

    public Employee getById(int id) {

//        Optional empFound = employees.stream().filter(emp -> emp.getId() == id).findFirst();
//        System.out.println(empFound);
//        if (empFound.isPresent()) {
//            return (Employee) empFound.get();
//        } else {
//            return null;
//        }

        Employee empFound = employees.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);
        System.out.println(empFound);
        return empFound;

    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
}
