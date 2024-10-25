package tn.esprit.ahmedbenhmida4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Registration implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int numRegistration ;
     int numWeek;
    @ManyToOne
    Skier skier;
    @ManyToOne
    Course course;
}
