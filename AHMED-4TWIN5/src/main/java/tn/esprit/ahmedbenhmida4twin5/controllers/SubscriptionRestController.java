package tn.esprit.ahmedbenhmida4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmedbenhmida4twin5.entities.Subscription;
import tn.esprit.ahmedbenhmida4twin5.services.ISubscriptionServices;
import tn.esprit.ahmedbenhmida4twin5.services.SubscriptionServicesImpl;
@RequiredArgsConstructor
@RequestMapping("/Subscription")
@RestController
public class SubscriptionRestController {

    private final ISubscriptionServices SubscriptionServices;

    @PostMapping("/add")
    public Subscription saveSubscription(@RequestBody Subscription Subscription) {
        return SubscriptionServices.addSubscription(Subscription);
    }

    @GetMapping("/get/{id}")
    public Subscription getSubscription(@PathVariable Long id) {
        return SubscriptionServices.retrieveSubscription(id);
    }

}
