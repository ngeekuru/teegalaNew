package com.example.tkrproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tkrproject.model.Employee;

//Marker interface
public interface EmpRepo extends JpaRepository<Employee,Integer>{

}
