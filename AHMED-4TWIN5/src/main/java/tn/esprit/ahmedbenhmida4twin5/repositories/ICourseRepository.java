package tn.esprit.ahmedbenhmida4twin5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ahmedbenhmida4twin5.entities.Course;



@Repository
public interface ICourseRepository extends JpaRepository<Course, Long> {
    Course findCourseBynumCourse(Long numCourse);
}
