package com.telecom.backend.api.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class SampleController {

    @RequestMapping(method = RequestMethod.GET)
    public String getAllEmployees() {
        // Your logic to get all employees goes here
        return "Get all employees";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createEmployee(@RequestBody String employeeJson) {
        // Your logic to create a new employee goes here
        return "Create a new employee";
    }
}
