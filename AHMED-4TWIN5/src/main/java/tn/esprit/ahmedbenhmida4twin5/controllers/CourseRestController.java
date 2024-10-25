package tn.esprit.ahmedbenhmida4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmedbenhmida4twin5.entities.Course;
import tn.esprit.ahmedbenhmida4twin5.services.ICourseServices;

@RequiredArgsConstructor
@RequestMapping("/Course")
@RestController
public class CourseRestController {

    private final ICourseServices CourseServices;

    @PostMapping("/add")
    public Course saveCourse(@RequestBody Course Course) {
        return CourseServices.addCourse(Course);
    }

    @GetMapping("/get/{id}")
    public Course getCourse(@PathVariable Long id) {
        return CourseServices.retrieveCourse(id);
    }

}
