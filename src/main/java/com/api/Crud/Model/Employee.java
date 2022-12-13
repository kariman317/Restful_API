package com.api.Crud.Model;

import javax.persistence.*;

@Entity
@Table(name = "Employees")

public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    @Column(name = "firstName")
    private String firstName ;

    @Column(name = "lastName")

    private String lastName ;

    @Column(name = "salary")

    private double salary ;
    @Column(name = "address")

    private  String address;


    public Employee() {
    }





    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(long id, String firstName, String lastName, double salary, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.address = address;
    }
}
