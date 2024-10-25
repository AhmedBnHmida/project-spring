package tn.esprit.ahmedbenhmida4twin5.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmedbenhmida4twin5.entities.Course;
import tn.esprit.ahmedbenhmida4twin5.repositories.ICourseRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseServicesImpl implements ICourseServices {

    private final ICourseRepository CourseRepository;

    @Override
    public Course addCourse(Course Course) {
        return CourseRepository.save(Course);
    }

    @Override
    public Course updateCourse(Course Course) {
        return CourseRepository.save(Course);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        return CourseRepository.findById(numCourse).orElse(null);
    }

    @Override
    public List<Course> retrieveAll() {
        return (List<Course>) CourseRepository.findAll();
    }

    @Override
    public void removeCourse(Long numCourse) {
        CourseRepository.deleteById(numCourse);
    }
}
