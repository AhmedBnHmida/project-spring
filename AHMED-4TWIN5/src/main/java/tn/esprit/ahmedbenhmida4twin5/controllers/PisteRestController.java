package tn.esprit.ahmedbenhmida4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmedbenhmida4twin5.entities.Piste;
import tn.esprit.ahmedbenhmida4twin5.services.IPisteServices;


import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/Piste")
@RestController
public class PisteRestController {

    private final IPisteServices PisteServices;

    @GetMapping("/getAll")
    public List<Piste> getAllPistes() {return PisteServices.retrieveAll();}

    @GetMapping("/get/{id}")
    public Piste getPiste(@PathVariable Long id) {
        return PisteServices.retrievePiste(id);
    }

    @PostMapping("/add")
    public Piste savePiste(@RequestBody Piste Piste) {
        return PisteServices.addPiste(Piste);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePiste(@PathVariable Long id) {PisteServices.removePiste(id);}

    @PutMapping("/update") public Piste updateSkier(@RequestBody Piste Piste) {return PisteServices.updatePiste(Piste);}

}
