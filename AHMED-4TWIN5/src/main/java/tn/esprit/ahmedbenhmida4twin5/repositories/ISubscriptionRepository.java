package tn.esprit.ahmedbenhmida4twin5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ahmedbenhmida4twin5.entities.Subscription;
import tn.esprit.ahmedbenhmida4twin5.entities.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionRepository extends JpaRepository<Subscription, Long> {
        Set<Subscription> findByTypeSubOrderByStartDate(TypeSubscription typeSub);
}
