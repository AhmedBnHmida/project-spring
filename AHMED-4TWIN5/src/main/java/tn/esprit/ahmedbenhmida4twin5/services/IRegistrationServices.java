package tn.esprit.ahmedbenhmida4twin5.services;

import tn.esprit.ahmedbenhmida4twin5.entities.Registration;

import java.util.List;

public interface IRegistrationServices {

    Registration addRegistration(Registration Registration);
    Registration updateRegistration(Registration Registration);
    Registration retrieveRegistration(Long id);
    List<Registration> retrieveAll();
    void removeRegistration(Long id);

    Registration addRegistrationAndAssignToSkier(Registration registration, Long idSkier);

    Registration assignRegistrationToCourse(Registration registration, Long idCourse);
}
