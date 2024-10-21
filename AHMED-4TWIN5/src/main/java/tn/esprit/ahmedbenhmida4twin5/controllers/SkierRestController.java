package tn.esprit.ahmedbenhmida4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmedbenhmida4twin5.entities.Skier;
import tn.esprit.ahmedbenhmida4twin5.services.ISkierServices;
import tn.esprit.ahmedbenhmida4twin5.services.SkierServicesImpl;
@RequiredArgsConstructor
@RequestMapping("/skier")
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

}
