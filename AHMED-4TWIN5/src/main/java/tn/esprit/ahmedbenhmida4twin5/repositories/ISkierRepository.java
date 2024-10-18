package tn.esprit.ahmedbenhmida4twin5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.ahmedbenhmida4twin5.entities.Skier;

public interface ISkierRepository extends JpaRepository< Skier , Long > {

}
