package tn.esprit.ahmedbenhmida4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmedbenhmida4twin5.entities.Course;
import tn.esprit.ahmedbenhmida4twin5.entities.Instructor;
import tn.esprit.ahmedbenhmida4twin5.repositories.ICourseRepository;
import tn.esprit.ahmedbenhmida4twin5.repositories.IInstructorRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class InstructorServicesImpl implements IInstructorServices {

    private final IInstructorRepository InstructorRepository;
    private final ICourseRepository CourseRepository;

    @Override
    public Instructor addInstructor(Instructor Instructor) {
        return InstructorRepository.save(Instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor Instructor) {
        return InstructorRepository.save(Instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long id) {
        return InstructorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Instructor> retrieveAll() {
        return (List<Instructor>) InstructorRepository.findAll();
    }

    @Override
    public void removeInstructor(Long id) {
        InstructorRepository.deleteById(id);
    }

    @Override
    public Instructor AddInstructorAndassignToCourse(Instructor Instructor, List<Long> idCourse){

        List<Course> courses = CourseRepository.findAllById(idCourse);
        // Check and initialize the instructor's courses if it's null
        if (Instructor.getCoures() == null) {
            Instructor.setCoures(new HashSet<>()); // Initialize courses with an empty Set
        }
        for (Course course : courses) {
            Instructor.getCoures().add(course);
        }
        return InstructorRepository.save(Instructor);
    }


    @Override
    public Instructor AddAndassignToCourse(Instructor Instructor){
        Set<Course> courses = Instructor.getCoures();
        if (courses == null) {
            Instructor.setCoures(new HashSet<>()); // Initialize courses with an empty Set
        }
        for (Course course : courses) {
            Instructor.getCoures().add(course);
        }
        return InstructorRepository.save(Instructor);
    }

}
