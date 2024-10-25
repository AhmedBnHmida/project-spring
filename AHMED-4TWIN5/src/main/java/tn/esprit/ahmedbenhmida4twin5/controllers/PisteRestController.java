package tn.esprit.ahmedbenhmida4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmedbenhmida4twin5.entities.Piste;
import tn.esprit.ahmedbenhmida4twin5.services.IPisteServices;
import tn.esprit.ahmedbenhmida4twin5.services.PisteServicesImpl;
@RequiredArgsConstructor
@RequestMapping("/Piste")
@RestController
public class PisteRestController {

    private final IPisteServices PisteServices;

    @PostMapping("/add")
    public Piste savePiste(@RequestBody Piste Piste) {
        return PisteServices.addPiste(Piste);
    }

    @GetMapping("/get/{id}")
    public Piste getPiste(@PathVariable Long id) {
        return PisteServices.retrievePiste(id);
    }

}
