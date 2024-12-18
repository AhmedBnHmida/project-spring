package tn.esprit.ahmedbenhmida4twin5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ahmedbenhmida4twin5.entities.Course;

import java.util.List;


public interface ICourseRepository extends JpaRepository<Course, Long> {
    Course findCourseBynumCourse(Long numCourse);
}
