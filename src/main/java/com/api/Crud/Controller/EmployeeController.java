package com.api.Crud.Controller;

import com.api.Crud.Model.Employee;
import com.api.Crud.Repositary.IEmployeeRepositary;
import com.api.Crud.Services.EmployeeService;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Employee")

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService ;
    @GetMapping("/employee")
    public List<Employee> getAll ()
    {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/empById/{id}")
    public Employee getEmpById (@PathVariable long id)
    {
        return employeeService.getEmpById(id);
    }
    @GetMapping("/empByName/{firstName}")
    public List<Employee> getEmpByFirstName (@PathVariable String firstName)
    {
        return employeeService.getEmpByFirstName(firstName);
    }

    @PostMapping("/employee")
    public String addEmp (@RequestBody Employee employee)
    {
        employeeService.add(employee);
        return "Added Successfully";
    }

    @PutMapping("/employee")
    public String update (@RequestBody Employee employee)
    {
        employeeService.update(employee);
        return "Updated Successfully";
    }

    @DeleteMapping("/employee/{id}")
    public String delete (@PathVariable long id)
    {
        employeeService.delete(id);
        return "Deleted Successfully";
    }

}
