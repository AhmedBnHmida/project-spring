package tn.esprit.ahmedbenhmida4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmedbenhmida4twin5.entities.Subscription;
import tn.esprit.ahmedbenhmida4twin5.entities.Subscription;
import tn.esprit.ahmedbenhmida4twin5.entities.TypeSubscription;
import tn.esprit.ahmedbenhmida4twin5.services.ISubscriptionServices;
import tn.esprit.ahmedbenhmida4twin5.services.ISubscriptionServices;
import tn.esprit.ahmedbenhmida4twin5.services.SubscriptionServicesImpl;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@RequestMapping("/Subscription")
@RestController
public class SubscriptionRestController {

    private final ISubscriptionServices SubscriptionServices;

    @GetMapping("/getAll")
    public List<Subscription> getAllSubscriptions() {return SubscriptionServices.retrieveAll();}

    @GetMapping("/get/{id}")
    public Subscription getSubscription(@PathVariable Long id) {
        return SubscriptionServices.retrieveSubscription(id);
    }

    @PostMapping("/add")
    public Subscription saveSubscription(@RequestBody Subscription Subscription) {
        return SubscriptionServices.addSubscription(Subscription);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSubscription(@PathVariable Long id) {SubscriptionServices.removeSubscription(id);}

    @PutMapping("/update") public Subscription updateSkier(@RequestBody Subscription Subscription) {return SubscriptionServices.updateSubscription(Subscription);}

    @GetMapping("/getSubscriptionsByType/{typeSubscription}")
    public Set<Subscription> getSubscriptionsByType(@PathVariable TypeSubscription typeSubscription) {
        return SubscriptionServices.getSubscriptionByType(typeSubscription);
    }

}
