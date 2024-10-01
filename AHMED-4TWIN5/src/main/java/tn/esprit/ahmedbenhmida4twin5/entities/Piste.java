package tn.esprit.ahmedbenhmida4twin5.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numPiste;
    private String namePiste;
    @Enumerated(EnumType.STRING)
    Color color;
    private int length;
    private int slope;

    @ManyToMany
    Set<Skier> skiers;
}
