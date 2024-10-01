package tn.esprit.ahmed4twin5.entities;

import jakarta.persistence.*;

import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numSub;
    private LocalDate startDate;
    private LocalDate endDate;
    private float price;
    private TypeSubscription typeSub;
}
