package com.example.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HrService {

    List<Employee> currentEmployees = new ArrayList<>();


    public void hire(Employee employee){
        currentEmployees.add(employee);
    }

    public void fire(Employee employee){
        currentEmployees.remove(employee);
    }

    public Employee findRandom(){
        return currentEmployees.iterator().next();
    }

    public void fireAll(){
        currentEmployees.clear();
    }

}
