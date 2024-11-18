package tn.esprit.ahmedbenhmida4twin5.services;

import tn.esprit.ahmedbenhmida4twin5.entities.Subscription;
import tn.esprit.ahmedbenhmida4twin5.entities.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionServices {

    Subscription addSubscription(Subscription Subscription);
    Subscription updateSubscription(Subscription Subscription);
    Subscription retrieveSubscription(Long id);
    List<Subscription> retrieveAll();
    void removeSubscription(Long id);
    Set<Subscription> getSubscriptionByType(TypeSubscription typeSubscription);
}
