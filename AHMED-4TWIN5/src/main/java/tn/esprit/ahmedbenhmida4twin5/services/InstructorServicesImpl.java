package tn.esprit.ahmedbenhmida4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmedbenhmida4twin5.entities.Instructor;
import tn.esprit.ahmedbenhmida4twin5.repositories.IInstructorRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InstructorServicesImpl implements IInstructorServices {

    private final IInstructorRepository InstructorRepository;

    @Override
    public Instructor addInstructor(Instructor Instructor) {
        return InstructorRepository.save(Instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor Instructor) {
        return InstructorRepository.save(Instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long id) {
        return InstructorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Instructor> retrieveAll() {
        return (List<Instructor>) InstructorRepository.findAll();
    }

    @Override
    public void removeInstructor(Long id) {
        InstructorRepository.deleteById(id);
    }
}
