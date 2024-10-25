package tn.esprit.ahmedbenhmida4twin5.services;

import tn.esprit.ahmedbenhmida4twin5.entities.Instructor;

import java.util.List;

public interface IInstructorServices {

    Instructor addInstructor(Instructor Instructor);
    Instructor updateInstructor(Instructor Instructor);
    Instructor retrieveInstructor(Long id);
    List<Instructor> retrieveAll();
    void removeInstructor(Long id);
}
