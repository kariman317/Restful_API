package com.api.Crud.Repositary;


import com.api.Crud.Model.Department;
import com.api.Crud.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDepartmentRepositary extends JpaRepository<Department , Long>
{
    public Department getDeptById(long id);

}
