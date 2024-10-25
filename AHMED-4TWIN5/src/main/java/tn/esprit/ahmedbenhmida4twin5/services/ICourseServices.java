package tn.esprit.ahmedbenhmida4twin5.services;

import tn.esprit.ahmedbenhmida4twin5.entities.Course;

import java.util.List;

public interface ICourseServices {

    Course addCourse(Course Course);
    Course updateCourse(Course Course);
    Course retrieveCourse(Long id);
    List<Course> retrieveAll();
    void removeCourse(Long id);
}
