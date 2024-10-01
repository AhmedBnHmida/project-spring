package tn.esprit.ahmed4twin5.entities;

import jakarta.persistence.*;

@Entity
public class course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numCourse;
    private int level ;
    private TypeCourse typeCourse ;
    private Support support;
    private float price;
    private int timeSlot;
}
