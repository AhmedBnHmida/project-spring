package tn.esprit.ahmedbenhmida4twin5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.ahmedbenhmida4twin5.entities.Skier;
import tn.esprit.ahmedbenhmida4twin5.entities.TypeSubscription;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

public interface ISkierRepository extends JpaRepository< Skier , Long > {
    Skier findByFirstnameAndLastname(String firstname, String lastname);
    Set<Skier> findAllByDateofbirth(LocalDate dateofbirth);
    Skier findSkierByIdSkier(Long idSkier);
    List<Skier> findSkierByFirstnameAndLastname(String firstname, String lastname);
    /*
    @Query("SELECT s FROM Skier s WHERE s.suscription.typeSub = :typeSubscription")
    List<Skier> findBySubscriptionType(@Param("typeSubscription") TypeSubscription typeSubscription);
*/
    List<Skier> findBySuscription_TypeSub(TypeSubscription typeSubscription);

}
