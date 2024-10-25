package tn.esprit.ahmedbenhmida4twin5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.ahmedbenhmida4twin5.entities.Skier;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

public interface ISkierRepository extends JpaRepository< Skier , Long > {
    Skier findByFirstnameAndLastname(String firstname, String lastname);
    Set<Skier> findAllByDateofbirth(LocalDate dateofbirth);
}
