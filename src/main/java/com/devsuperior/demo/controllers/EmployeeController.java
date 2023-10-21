package com.devsuperior.demo.controllers;

import com.devsuperior.demo.dto.EmployeeDTO;
import com.devsuperior.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {


    @Autowired
    private EmployeeService service;
    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> findAll(){
        List<EmployeeDTO> dto = service.findAll();
        return ResponseEntity.ok(dto);
    }
}
