package tn.esprit.ahmed4twin5.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
//@Table(name="t_skier")
public class Skier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSkier;
    private String name;
    private LocalDate birthDate;



}
