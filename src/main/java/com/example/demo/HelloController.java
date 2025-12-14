package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")

public class HelloController {

    @PostMapping
    public String createStudent(@RequestBody String name){
        return "Student created with name : " + name;
    }

    @GetMapping("/{id}")
    public String getStudent(@PathVariable int id){
        return "Student " + id ;

    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id,
                                @RequestBody String name){
        return "Student "+ id + "updated to name: " + name;
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        return "Student " + id + "deleted";
    }


}
