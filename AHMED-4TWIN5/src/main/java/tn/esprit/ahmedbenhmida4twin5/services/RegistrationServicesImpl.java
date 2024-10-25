package tn.esprit.ahmedbenhmida4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmedbenhmida4twin5.entities.Registration;
import tn.esprit.ahmedbenhmida4twin5.repositories.IRegistrationRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RegistrationServicesImpl implements IRegistrationServices {

    private final IRegistrationRepository RegistrationRepository;

    @Override
    public Registration addRegistration(Registration Registration) {
        return RegistrationRepository.save(Registration);
    }

    @Override
    public Registration updateRegistration(Registration Registration) {return RegistrationRepository.save(Registration);}

    @Override
    public Registration retrieveRegistration(Long id) {
        return RegistrationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Registration> retrieveAll() {
        return (List<Registration>) RegistrationRepository.findAll();
    }

    @Override
    public void removeRegistration(Long id) {
        RegistrationRepository.deleteById(id);
    }

}
