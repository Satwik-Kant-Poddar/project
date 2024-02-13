package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    private void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("poornima","patel"));
        theStudents.add(new Student("satwik","poddar"));
        theStudents.add(new Student("surbhi","pal"));
    }

    @GetMapping("/students")
    public List<Student> getStudent(){
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student studentByid(@PathVariable int studentId) throws Exception {
        if((studentId>= theStudents.size())||studentId<0){
            throw  new StudentNotFoundException("student id not found - "+studentId);
        }
        return theStudents.get(studentId);
    }



}














