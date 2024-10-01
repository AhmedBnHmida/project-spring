package tn.esprit.ahmedbenhmida4twin5.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numInstructor;
    private String name;
    private LocalDate dateOfHire;
    @OneToMany
    Set<course> coures;
}
