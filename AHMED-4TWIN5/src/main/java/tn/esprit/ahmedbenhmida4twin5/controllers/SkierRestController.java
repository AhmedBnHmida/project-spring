package tn.esprit.ahmedbenhmida4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmedbenhmida4twin5.entities.Skier;
import tn.esprit.ahmedbenhmida4twin5.services.ISkierServices;
import tn.esprit.ahmedbenhmida4twin5.services.SkierServicesImpl;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@RequiredArgsConstructor
@RequestMapping("/Skier")
@RestController
public class SkierRestController {

    private final ISkierServices skierServices;

    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier) {
        return skierServices.addSkier(skier);
    }

    @GetMapping("/get/{id}")
    public Skier getSkier(@PathVariable Long id) {
        return skierServices.retrieveSkier(id);
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
}
