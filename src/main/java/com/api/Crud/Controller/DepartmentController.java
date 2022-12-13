package com.api.Crud.Controller;


import com.api.Crud.Model.Department;
import com.api.Crud.Model.Employee;
import com.api.Crud.Services.DepartmentService;
import com.api.Crud.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Department")

public class DepartmentController {

    @Autowired
    private DepartmentService departmentService ;
    @GetMapping("/department")
    public List<Department> getAll ()
    {
        return departmentService.getAllDepartment();
    }

    @GetMapping("/empById/{id}")
    public Department getDeptById (@PathVariable long id)
    {
        return departmentService.getDeptById(id);
    }


    @PostMapping("/department")
    public String addDept (@RequestBody Department department)
    {
        departmentService.add(department);
        return "Added Successfully";
    }

    @PutMapping("/department")
    public String update (@RequestBody Department department)
    {
        departmentService.update(department);
        return "Updated Successfully";
    }

    @DeleteMapping("/department/{id}")
    public String delete (@PathVariable long id)
    {
        departmentService.delete(id);
        return "Deleted Successfully";
    }

}
