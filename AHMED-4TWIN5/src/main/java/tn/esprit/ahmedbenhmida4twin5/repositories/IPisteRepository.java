package tn.esprit.ahmedbenhmida4twin5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ahmedbenhmida4twin5.entities.Color;
import tn.esprit.ahmedbenhmida4twin5.entities.Piste;

import java.util.List;

public interface IPisteRepository extends JpaRepository<Piste, Long> {
    List<Piste> findByColor(Color color);
}
