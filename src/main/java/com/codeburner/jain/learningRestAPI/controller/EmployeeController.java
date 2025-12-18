package com.codeburner.jain.learningRestAPI.controller;

import com.codeburner.jain.learningRestAPI.dto.EmployeeDTO;
import com.codeburner.jain.learningRestAPI.entities.EmployeeEntity;
import com.codeburner.jain.learningRestAPI.respositories.EmployeeRepository;
import com.codeburner.jain.learningRestAPI.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee) {
        return employeeService.createNewEmployee(inputEmployee);
    }

    @PutMapping String updateEmployeeById(){
        return "Hello from PUT";
    }

}
