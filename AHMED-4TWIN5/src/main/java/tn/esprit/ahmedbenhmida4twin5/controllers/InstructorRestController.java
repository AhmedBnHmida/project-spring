package tn.esprit.ahmedbenhmida4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmedbenhmida4twin5.entities.Instructor;
import tn.esprit.ahmedbenhmida4twin5.services.IInstructorServices;
import tn.esprit.ahmedbenhmida4twin5.services.InstructorServicesImpl;
@RequiredArgsConstructor
@RequestMapping("/Instructor")
@RestController
public class InstructorRestController {

    private final IInstructorServices InstructorServices;

    @PostMapping("/add")
    public Instructor saveInstructor(@RequestBody Instructor Instructor) {
        return InstructorServices.addInstructor(Instructor);
    }

    @GetMapping("/get/{id}")
    public Instructor getInstructor(@PathVariable Long id) {
        return InstructorServices.retrieveInstructor(id);
    }

}
