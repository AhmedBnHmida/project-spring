package tn.esprit.ahmed4twin5.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numInstructor;
    private String name;
    private LocalDate dateOfHire;
}
