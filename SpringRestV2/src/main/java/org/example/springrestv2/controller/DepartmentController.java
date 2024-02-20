package org.example.springrestv2.controller;

import org.example.springrestv2.model.Department;
import org.example.springrestv2.model.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentRepository deptrep;
    @PostMapping("/insert")
    public Department insert(@RequestBody Department d)
    {
        return deptrep.save(d);
    }

}
