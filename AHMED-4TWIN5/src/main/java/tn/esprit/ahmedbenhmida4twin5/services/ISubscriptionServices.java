package tn.esprit.ahmedbenhmida4twin5.services;

import tn.esprit.ahmedbenhmida4twin5.entities.Subscription;

import java.util.List;

public interface ISubscriptionServices {

    Subscription addSubscription(Subscription Subscription);
    Subscription updateSubscription(Subscription Subscription);
    Subscription retrieveSubscription(Long id);
    List<Subscription> retrieveAll();
    void removeSubscription(Long id);
}
