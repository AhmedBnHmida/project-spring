package tn.esprit.ahmedbenhmida4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
//@Table(name="t_skier")
public class Skier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int idSkier;
     String firstname;
     String lastname;
     @DateTimeFormat(pattern = "yyyy-MM-dd")
     LocalDate dateofbirth;
     String city;

    @OneToOne(cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
    Subscription suscription;
    @OneToMany(mappedBy = "skier", fetch = FetchType.EAGER)
    Set<Registration> registrations;
    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;


}
