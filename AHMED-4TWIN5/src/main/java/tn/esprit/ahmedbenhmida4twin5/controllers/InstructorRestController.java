package tn.esprit.ahmedbenhmida4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmedbenhmida4twin5.entities.Instructor;
import tn.esprit.ahmedbenhmida4twin5.services.IInstructorServices;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RequestMapping("/Instructor")
@RestController
public class InstructorRestController {

    private final IInstructorServices InstructorServices;

    @GetMapping("/getAll")
    public List<Instructor> getAllInstructors() {return InstructorServices.retrieveAll();}

    @GetMapping("/get/{id}")
    public Instructor getInstructor(@PathVariable Long id) {
        return InstructorServices.retrieveInstructor(id);
    }

    @PostMapping("/add")
    public Instructor saveInstructor(@RequestBody Instructor Instructor) {
        return InstructorServices.addInstructor(Instructor);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteInstructor(@PathVariable Long id) {InstructorServices.removeInstructor(id);}

    @PutMapping("/update") public Instructor updateSkier(@RequestBody Instructor Instructor) {return InstructorServices.updateInstructor(Instructor);}

    @PostMapping("/AddInstructorAndAssignToCourse/{idCourses}")
    public Instructor AddInstructorAndAssignToCourse(@RequestBody Instructor Instructor,@PathVariable List<Long> idCourses){
        return InstructorServices.AddInstructorAndassignToCourse(Instructor,idCourses);
    }

    @PostMapping("/AddAndAssignToCourse")
    public Instructor AddAndAssignToCourse(@RequestBody Instructor Instructor){
        return InstructorServices.AddAndassignToCourse(Instructor);
    }
}
