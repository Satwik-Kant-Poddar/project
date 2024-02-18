package com.example.project.rest;

import com.example.project.entity.Phone;
import com.example.project.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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

    Phone model1 = new Phone();
    Phone demophone(){

        model1.setName("s20 fe 5g");
        model1.setBattery("4500 mah");
        model1.setCamera("triple camera");
        model1.setBody_type("metal frame");
        model1.setCharing("25 wired , 15 w wireless");
        model1.setLaunch_date("12 jan 2023");
        model1.setMemory("128 rom , 8 ram");
        model1.setOs("andoird");
        model1.setSound("dual speaker");
        model1.setDisplay("6.5 inch amoled 1080 403 ppi");
        return model1;
    }

    @Transactional
    @GetMapping("saveinphone")
    public String save(){
        Phone model = demophone();
        model.toString();
        entityManager.persist(model);
        return model.toString() +"\n phone saved in db";
    }

    @GetMapping("getphone")
    public Phone getphone(){
        return entityManager.find(Phone.class,1);
    }
}
