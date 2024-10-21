package tn.esprit.ahmedbenhmida4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmedbenhmida4twin5.entities.Skier;
import tn.esprit.ahmedbenhmida4twin5.repositories.ISkierRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SkierServicesImpl implements ISkierServices {

    private final ISkierRepository skierRepository;

    @Override
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long id) {
        return skierRepository.findById(id).orElse(null);
    }

    @Override
    public List<Skier> retrieveAll() {
        return (List<Skier>) skierRepository.findAll();
    }

    @Override
    public void removeSkier(Long id) {
        skierRepository.deleteById(id);
    }
}
