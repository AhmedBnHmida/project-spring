package tn.esprit.ahmedbenhmida4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmedbenhmida4twin5.entities.Registration;
import tn.esprit.ahmedbenhmida4twin5.services.IRegistrationServices;
import tn.esprit.ahmedbenhmida4twin5.services.RegistrationServicesImpl;
@RequiredArgsConstructor
@RequestMapping("/Registration")
@RestController
public class RegistrationRestController {

    private final IRegistrationServices RegistrationServices;

    @PostMapping("/add")
    public Registration saveRegistration(@RequestBody Registration Registration) {
        return RegistrationServices.addRegistration(Registration);
    }

    @GetMapping("/get/{id}")
    public Registration getRegistration(@PathVariable Long id) {
        return RegistrationServices.retrieveRegistration(id);
    }

    @PostMapping("/addd/{idSkier}")
    public Registration addRegistrationAndAssignToSkier(@RequestBody Registration Registration, @PathVariable Long idSkier) {
        return RegistrationServices.addRegistrationAndAssignToSkier(Registration,idSkier);
    }

    @PostMapping("/addc/{idCourse}")
    public Registration assignRegistrationToCourse(@RequestBody Registration Registration, @PathVariable Long idCourse) {
        return RegistrationServices.assignRegistrationToCourse(Registration,idCourse);
    }

}
