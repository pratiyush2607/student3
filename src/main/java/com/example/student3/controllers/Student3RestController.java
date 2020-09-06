package com.example.student3.controllers;

import com.example.student3.domain.Student3;
import com.example.student3.repos.Student3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Student3RestController {

    @Autowired
    Student3Repository repository;

    @RequestMapping(value = "/student3/",method = RequestMethod.GET)
    public Iterable<Student3> getStudent3(){
        return repository.findAll();

    }
    @RequestMapping(value="/student3/{id}", method = RequestMethod.GET)
    public Student3 getStudent3(@PathVariable("id") long id){
        return repository.findById(id).get();
    }
    @RequestMapping(value="/student3/{id}", method = RequestMethod.POST)
    public Student3 createStudent3(@RequestBody Student3 student3){
        return repository.save(student3);
    }
    @RequestMapping(value="/student3/{id}", method = RequestMethod.PUT)
    public Student3 updateStudent3(@RequestBody Student3 student3) {
        return repository.save(student3);
    }
    @RequestMapping(value="/student3/{id}", method = RequestMethod.DELETE)
    public void deleteStudent3(@PathVariable("id") long id) {
        repository.deleteById(id);
    }
}
