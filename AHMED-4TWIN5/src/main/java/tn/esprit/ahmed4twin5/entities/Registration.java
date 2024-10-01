package tn.esprit.ahmed4twin5.entities;

import jakarta.persistence.*;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numRegistration ;
    private int numWeek;
}
