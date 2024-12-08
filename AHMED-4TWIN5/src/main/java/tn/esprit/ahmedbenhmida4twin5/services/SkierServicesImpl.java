package tn.esprit.ahmedbenhmida4twin5.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.ahmedbenhmida4twin5.entities.*;
import tn.esprit.ahmedbenhmida4twin5.repositories.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
@Slf4j
public class SkierServicesImpl implements ISkierServices {

    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
    private final ICourseRepository courseRepository;
    private final IRegistrationRepository registrationRepository;
    private final ISubscriptionRepository subscriptionRepository;
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
/*
    public Skier AddSkierAndAssignToCourse(Skier skier, Long numCourse) {


        Registration registration = new Registration();
        registration.setSkier(skier);
        registration.setCourse(courseRepository.findById(numCourse).orElse(null));

        Set<Registration> r =new HashSet<>();
        r.add(registration);
        skier.setRegistrations(r);

        skierRepository.save(skier);
        registrationRepository.save(registration);

        return skier;
    }

 */
public Skier AddSkierAndAssignToCourse(Skier skier, Long numCourse) {
    /*
    // Save the subscription (if it exists)
    if (skier.getSuscription() != null) {
        subscriptionRepository.save(skier.getSuscription());
    }
     */

    // Create a set for registrations
    Set<Registration> registrations = new HashSet<>();

    // Populate registrations based on the input skier's registrations
    if (skier.getRegistrations() != null) {
        for (Registration reg : skier.getRegistrations()) {
            Registration registration = new Registration();
            registration.setNumWeek(reg.getNumWeek());
            registration.setSkier(skier);
            registration.setCourse(courseRepository.findById(numCourse).orElse(null));
            registrations.add(registration);
        }
    }

    skier.setRegistrations(registrations);
    skierRepository.save(skier);

    for (Registration registration : registrations) {
        registrationRepository.save(registration);
    }

    return skier;
}


    @Override
    public List<Skier> retrieveSkierBySubscriptionType(TypeSubscription typeSubscription) {
        return skierRepository.findBySuscription_TypeSub(typeSubscription);
    }

    @Scheduled(fixedDelay = 6000)
    @Override
    public void getSkiernatif() {
        System.out.println("Bonjour");
        log.info("bonjour");
        log.warn("warning!");
        log.error("§");
    }

}