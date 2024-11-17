package tn.esprit.ahmedbenhmida4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmedbenhmida4twin5.entities.Course;
import tn.esprit.ahmedbenhmida4twin5.services.ICourseServices;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/Course")
@RestController
public class CourseRestController {

    private final ICourseServices CourseServices;

    @GetMapping("/getAll")
    public List<Course> getAllCourses() {return CourseServices.retrieveAll();}

    @GetMapping("/get/{id}")
    public Course getCourse(@PathVariable Long id) {
        return CourseServices.retrieveCourse(id);
    }

    @PostMapping("/add")
    public Course saveCourse(@RequestBody Course Course) {
        return CourseServices.addCourse(Course);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable Long id) {CourseServices.removeCourse(id);}

    @PutMapping("/update") public Course updateSkier(@RequestBody Course course) {return CourseServices.updateCourse(course);}


}
