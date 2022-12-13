package com.api.Crud.Repositary;

import com.api.Crud.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepositary extends JpaRepository<Employee , Long>
{

    public Employee getEmpById(long id);
    public List<Employee> findByFirstName(String firstName);

}
