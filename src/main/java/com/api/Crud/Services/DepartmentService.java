package com.api.Crud.Services;

import com.api.Crud.Model.Department;
import com.api.Crud.Model.Employee;
import com.api.Crud.Repositary.IDepartmentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private IDepartmentRepositary departmentRepositary ;

    public List<Department> getAllDepartment() {
        return departmentRepositary.findAll();
    }

    public Department getDeptById(long id) {
        return departmentRepositary.findById(id).orElseThrow(null);
    }



    public void add (Department department)
    {
        departmentRepositary.save(department);
    }

    public void update (Department department)
    {
        departmentRepositary.save(department);
    }
    public void delete (long id)
    {
        departmentRepositary.deleteById(id);
    }


}
