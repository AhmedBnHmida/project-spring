package tn.esprit.ahmedbenhmida4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int numInstructor;
     String name;
     LocalDate dateOfHire;
    @OneToMany
    Set<course> coures;
}
