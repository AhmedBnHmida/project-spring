package tn.esprit.ahmedbenhmida4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int numCourse;
     int level ;
    @Enumerated(EnumType.STRING)
    TypeCourse typeCourse ;
    @Enumerated(EnumType.STRING)
    Support support;
     float price;
     int timeSlot;
    @OneToMany(mappedBy = "course")
    Set<Registration> registrations;

}
