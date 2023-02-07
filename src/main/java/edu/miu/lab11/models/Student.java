package edu.miu.lab11.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;

/**
 *
 * @author Daniel Tsegay Meresie
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private String studentNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private Double cgpa;
    private LocalDate enrollmentDate;
    private Boolean isInternational;
}
