package com.codeburner.jain.learningRestAPI.controller;

import com.codeburner.jain.learningRestAPI.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId) {
        return new EmployeeDTO(employeeId, "Sahil", "sahil@gmail.com", 26, LocalDate.of(2024,8,26), true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam Integer age) {
        return "Hi age "+age;
    }

    @PostMapping
    public String createNewEmployee() {
        return "Hello from POST";
    }

    @PutMapping String updateEmployeeById(){
        return "Hello from PUT";
    }

}
