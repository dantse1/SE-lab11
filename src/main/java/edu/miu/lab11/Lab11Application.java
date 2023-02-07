package edu.miu.lab11;

import edu.miu.lab11.models.Student;
import edu.miu.lab11.repositories.StudentRepository;
import java.time.LocalDate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import edu.miu.lab11.services.implementations.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class Lab11Application implements CommandLineRunner {
    @Autowired
    StudentService studentService;
    @Autowired
    StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(Lab11Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Student s = new Student(null, "000-61-0001", "Daniel", "Tsegay", "Meresie", 3.5, LocalDate.now(), true);
        //studentService.addStudent(s);
        
    }

}
