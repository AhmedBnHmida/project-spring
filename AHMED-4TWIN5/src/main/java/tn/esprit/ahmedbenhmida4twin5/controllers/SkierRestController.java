package tn.esprit.ahmedbenhmida4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmedbenhmida4twin5.entities.Color;
import tn.esprit.ahmedbenhmida4twin5.entities.Registration;
import tn.esprit.ahmedbenhmida4twin5.entities.Skier;
import tn.esprit.ahmedbenhmida4twin5.services.ISkierServices;
import tn.esprit.ahmedbenhmida4twin5.services.SkierServicesImpl;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;
@Tag(name = "Gestion Skier")
@RequiredArgsConstructor
@RestController
@RequestMapping("/Skier")
public class SkierRestController {

    private final ISkierServices skierServices;

    @Operation(description = "GET ALL Skier from the database")
    @GetMapping("/getAll")
    public List<Skier> getAllRegistrations() {return skierServices.retrieveAll();}

    @GetMapping("/get/{id}")
    public Skier getSkier(@PathVariable Long id) {
        return skierServices.retrieveSkier(id);
    }

    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier) {
        return skierServices.addSkier(skier);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSkier(@PathVariable Long id) {
        skierServices.removeSkier(id);
    }

    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier) {return skierServices.updateSkier(skier);}

    @PutMapping ("/assignSkierToPiste/{idSkier}/{idPiste}")
    public void assignSkierToPiste(@PathVariable Long idSkier, @PathVariable Long idPiste) {
         skierServices.assignSkierToPiste(idSkier, idPiste);
    }

    @GetMapping("/getBy/{firstname}/{lastname}")
    public Skier getSkierByFirstnameAndLastname(@PathVariable String firstname, @PathVariable String lastname) {
        return skierServices.getByFirstAndLastname(firstname, lastname);

    }

    @GetMapping("/getAll/{dateofbirth}")
    public Set<Skier> getAllSkiers(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd ") LocalDate dateofbirth) {
        //Date date = new Date(dateofbirth);
        return skierServices.getSkiersByDateofbirth(dateofbirth);
    }
    @PostMapping("/assignSkierToPiste/{fname}/{lname}/{color}")
    public List<Skier> assignSkierToPiste(@PathVariable String fname,@PathVariable String lname,@PathVariable Color color){
        return skierServices.assignSkierToPiste(fname, lname, color);
    }

    @PostMapping("/AddSkierAndAssignToCourse/{idCourse}")
    public Skier addSkierAndAssignToCourse(@RequestBody Skier skier,@PathVariable Long idCourse){
       return skierServices.AddSkierAndAssignToCourse(skier,idCourse);
    }
}
