package tn.esprit.ahmedbenhmida4twin5.services;
import tn.esprit.ahmedbenhmida4twin5.entities.Color;
import tn.esprit.ahmedbenhmida4twin5.entities.Skier;
import tn.esprit.ahmedbenhmida4twin5.entities.TypeSubscription;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

public interface ISkierServices {

    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    Skier retrieveSkier(Long id);
    List<Skier> retrieveAll();
    void removeSkier(Long id);
    void assignSkierToPiste(Long idSkier, Long idPiste);
    Skier getByFirstAndLastname(String firstname, String lastname);
    Set<Skier> getSkiersByDateofbirth(LocalDate dateofbirth);
    List<Skier> assignSkierToPiste(String fname, String lname, Color color);
    Skier AddSkierAndAssignToCourse(Skier skier, Long idCourse);
    List<Skier> retrieveSkierBySubscriptionType(TypeSubscription typeSub);
    }
