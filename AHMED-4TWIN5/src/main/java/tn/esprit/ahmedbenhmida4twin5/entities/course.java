package tn.esprit.ahmedbenhmida4twin5.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numCourse;
    private int level ;
    @Enumerated(EnumType.STRING)
    TypeCourse typeCourse ;
    @Enumerated(EnumType.STRING)
    Support support;
    private float price;
    private int timeSlot;
    @OneToMany(mappedBy = "course")
    Set<Registration> registrations;

}
