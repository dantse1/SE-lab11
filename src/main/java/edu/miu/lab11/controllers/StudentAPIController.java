package edu.miu.lab11.controllers;

import edu.miu.lab11.models.Student;
import edu.miu.lab11.services.implementations.StudentService;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Daniel Tsegay Meresie
 */
@RestController
@RequestMapping("/eregistrar/api/student")
public class StudentAPIController {
    @Autowired
    StudentService studentService;

    @GetMapping("/list")
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }
    @PostMapping("/register")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
        
    }
    @PostMapping("/update/{id}")
    public Student updateStudentById(@PathVariable Integer id, @RequestBody Student student){
        student.setStudentId(id);
        return studentService.addStudent(student); 
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable Integer id){
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        
    }
}
