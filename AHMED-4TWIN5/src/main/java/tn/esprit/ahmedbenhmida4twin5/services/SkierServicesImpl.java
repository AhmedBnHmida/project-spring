package tn.esprit.ahmedbenhmida4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmedbenhmida4twin5.entities.Color;
import tn.esprit.ahmedbenhmida4twin5.entities.Piste;
import tn.esprit.ahmedbenhmida4twin5.entities.Skier;
import tn.esprit.ahmedbenhmida4twin5.entities.Subscription;
import tn.esprit.ahmedbenhmida4twin5.repositories.IPisteRepository;
import tn.esprit.ahmedbenhmida4twin5.repositories.ISkierRepository;
import tn.esprit.ahmedbenhmida4twin5.repositories.ISubscriptionRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class SkierServicesImpl implements ISkierServices {

    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
    private final ISubscriptionRepository suscriptionRe;

    @Override
    public Skier addSkier(Skier skier) {
/*
        // Assign the skier to a subscription
        Subscription suscription = skier.getSuscription();
        suscriptionRe.save(suscription);
        skier.setSuscription(suscription);
*/
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

    @Override
    public void assignSkierToPiste(Long skierId, Long pisteId){
        Skier skier = skierRepository.findById(skierId).orElse(null);
        Piste piste = pisteRepository.findById(pisteId).orElse(null);

        piste.getSkiers().add(skier);
        pisteRepository.save(piste);


    }
    @Override
    public Skier getByFirstAndLastname(String firstname, String lastname) {
        return skierRepository.findByFirstnameAndLastname(firstname, lastname);
    }
    @Override
    public Set<Skier> getSkiersByDateofbirth(LocalDate dateofbirth){
        return skierRepository.findAllByDateofbirth(dateofbirth);
    }

    @Override
    public List<Skier> assignSkierToPiste(String fname, String lname, Color color){
        List<Skier> skier = skierRepository.findSkierByFirstnameAndLastname(fname, lname);
        List<Piste> piste = pisteRepository.findByColor(color);
        /*
        for(Skier s : skier) {
            for(Piste p : piste) {
                s.getPistes().add(p);
            }
            skierRepository.save(s);
        }
        */
        for(Skier s : skier) {
            s.getPistes().addAll(piste);  // Add all pistes at once
            skierRepository.save(s);
        }
        return skier;
    }
}