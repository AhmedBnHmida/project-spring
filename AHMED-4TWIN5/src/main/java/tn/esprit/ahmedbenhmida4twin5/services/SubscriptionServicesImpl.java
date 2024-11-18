package tn.esprit.ahmedbenhmida4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmedbenhmida4twin5.entities.Subscription;
import tn.esprit.ahmedbenhmida4twin5.entities.TypeSubscription;
import tn.esprit.ahmedbenhmida4twin5.repositories.ISubscriptionRepository;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@RequiredArgsConstructor
@Service
public class SubscriptionServicesImpl implements ISubscriptionServices {

    private final ISubscriptionRepository SubscriptionRepository;

    @Override
    public Subscription addSubscription(Subscription Subscription) {
        return SubscriptionRepository.save(Subscription);
    }

    @Override
    public Subscription updateSubscription(Subscription Subscription) {
        return SubscriptionRepository.save(Subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long id) {
        return SubscriptionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Subscription> retrieveAll() {
        return (List<Subscription>) SubscriptionRepository.findAll();
    }

    @Override
    public void removeSubscription(Long id) {
        SubscriptionRepository.deleteById(id);
    }

    @Override
    public Set<Subscription> getSubscriptionByType(TypeSubscription typeSubscription) {
        return SubscriptionRepository.findByTypeSubOrderByStartDate(typeSubscription);
    }
}
