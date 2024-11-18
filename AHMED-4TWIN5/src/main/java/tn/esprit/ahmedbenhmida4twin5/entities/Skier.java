package tn.esprit.ahmedbenhmida4twin5.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    //@JsonIgnore
   // @OneToOne(cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
    @OneToOne(cascade = CascadeType.ALL)
    Subscription suscription;
    @JsonIgnore
    @OneToMany(mappedBy = "skier", fetch = FetchType.EAGER)
    Set<Registration> registrations;
    @JsonIgnore
    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;


}
