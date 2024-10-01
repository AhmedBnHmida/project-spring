package tn.esprit.ahmedbenhmida4twin5.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
//@Table(name="t_skier")
public class Skier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSkier;
    private String name;
    private LocalDate birthDate;
    @OneToOne(mappedBy = "skier")
    Subscription subscriptions;
    @OneToMany(mappedBy = "skier")
    Set<Registration> registrations;

    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;


}
