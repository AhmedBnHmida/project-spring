package tn.esprit.ahmedbenhmida4twin5.services;
import tn.esprit.ahmedbenhmida4twin5.entities.Skier;

import java.time.LocalDate;
import java.util.List;

public interface ISkierServices {

    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    Skier retrieveSkier(Long id);
    List<Skier> retrieveAll();
    void removeSkier(Long id);
}
