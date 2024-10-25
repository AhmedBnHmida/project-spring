package tn.esprit.ahmedbenhmida4twin5.services;

import tn.esprit.ahmedbenhmida4twin5.entities.Piste;

import java.util.List;

public interface IPisteServices {

    Piste addPiste(Piste Piste);
    Piste updatePiste(Piste Piste);
    Piste retrievePiste(Long id);
    List<Piste> retrieveAll();
    void removePiste(Long id);
}
