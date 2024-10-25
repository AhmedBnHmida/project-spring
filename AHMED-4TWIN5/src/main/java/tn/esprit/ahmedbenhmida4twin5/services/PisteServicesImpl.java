package tn.esprit.ahmedbenhmida4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmedbenhmida4twin5.entities.Piste;
import tn.esprit.ahmedbenhmida4twin5.repositories.IPisteRepository;


import java.util.List;

@RequiredArgsConstructor
@Service
public class PisteServicesImpl implements IPisteServices {

    private final IPisteRepository PisteRepository;

    @Override
    public Piste addPiste(Piste Piste) {
        return PisteRepository.save(Piste);
    }

    @Override
    public Piste updatePiste(Piste Piste) {
        return PisteRepository.save(Piste);
    }

    @Override
    public Piste retrievePiste(Long id) {
        return PisteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Piste> retrieveAll() {
        return (List<Piste>) PisteRepository.findAll();
    }

    @Override
    public void removePiste(Long id) {
        PisteRepository.deleteById(id);
    }
}
