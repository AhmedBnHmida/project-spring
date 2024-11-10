package tn.esprit.ahmedbenhmida4twin5.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @ManyToOne
    Skier skier;
    @JsonIgnore
    @ManyToOne
    Course course;
}
