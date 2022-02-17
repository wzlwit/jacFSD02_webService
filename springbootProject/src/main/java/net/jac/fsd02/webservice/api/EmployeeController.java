package net.jac.fsd02.webservice.api;

import net.jac.fsd02.webservice.model.Employee;
import net.jac.fsd02.webservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    //    GET
    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployee();
    }

    //    GET by ID
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getById(id);
    }

    //    POST
    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee emp) {
        employeeService.addEmployee(emp);
        return emp;
    }
}
