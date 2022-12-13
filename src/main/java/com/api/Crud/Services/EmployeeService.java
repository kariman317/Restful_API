package com.api.Crud.Services;


import com.api.Crud.Model.Employee;
import com.api.Crud.Repositary.IEmployeeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepositary employeeRepositary;

    public List<Employee> getAllEmployees() {
        return employeeRepositary.findAll();
    }

    public Employee getEmpById(long id) {
        return employeeRepositary.findById(id).orElseThrow(null);
    }

    public List<Employee> getEmpByFirstName(String firstName) {
        return employeeRepositary.findByFirstName(firstName);
    }

    public void add (Employee employee)
    {
        employeeRepositary.save(employee);
    }

    public void update (Employee employee)
    {
        employeeRepositary.save(employee);
    }
    public void delete (long id)
    {
        employeeRepositary.deleteById(id);
    }


}
