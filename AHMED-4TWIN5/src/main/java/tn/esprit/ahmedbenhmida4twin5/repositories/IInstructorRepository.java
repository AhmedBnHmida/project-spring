package tn.esprit.ahmedbenhmida4twin5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ahmedbenhmida4twin5.entities.Instructor;

public interface IInstructorRepository extends JpaRepository<Instructor, Integer> {
}
