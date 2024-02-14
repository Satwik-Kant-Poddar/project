package com.example.project.rest;

import com.example.project.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private EntityManager entityManager;

    @Autowired
    DemoController(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @GetMapping("/helloworld")
    public String helloword(){
        return "hello world !!";
    }

    @GetMapping("testDB1")
    public Student test1(){
        return entityManager.find(Student.class,1);
    }

    @GetMapping("testDB2")
    public List<Student> test2(){
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM student", Student.class);
        System.out.println(theQuery);
        List<Student> students = theQuery.getResultList();
        return students;
    }
}
