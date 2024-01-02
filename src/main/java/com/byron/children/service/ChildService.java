package com.byron.children.service;

import com.byron.children.repository.ChildRepository;
import com.byron.children.repository.MotherRepository;
import org.springframework.stereotype.Service;
import com.byron.children.entities.Child;

import java.util.List;
import java.util.Optional;

@Service
public class ChildService {

    private final ChildRepository childRepository;

    public ChildService(ChildRepository childRepository){
        this.childRepository = childRepository;
    }

    public void saveChild(Child child){
        childRepository.save(child);
    }

    public void editChildByRegNumber(String regNumber, Child childBody){

        Child child = null;

        var childRecord = childRepository.findById(regNumber);

        if (childRecord.isPresent()){
            child = childRecord.get();

            var name = childBody.getName();
            var pob = childBody.getPlaceOfBirth();
            var dob = childBody.getDateOfBirth();
            var weight = childBody.getWeight();
            var gender = childBody.getGender();
            var mother = childBody.getMother();

            if (name != null){
                child.setName(name);
            }

            if (pob != null){
                child.setPlaceOfBirth(pob);
            }

            if (dob != null){
                child.setDateOfBirth(dob);
            }

//            if (weight != null){
//                child.setWeight(weight);
//            }

            if (gender != null){
                child.setGender(gender);
            }

            if (mother != null){
                child.setMother(mother);
            }

            childRepository.save(child);
        }
    }

    public Optional<Child> findChildByName(String name){
        return childRepository.findChildByName(name);
    }

    public List<Child> getAllChildren(){
        return childRepository.findAll();
    }
}
