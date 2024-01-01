package com.byron.children.service;

import com.byron.children.repository.ChildRepository;
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

        if (childRepository.findById(regNumber).isPresent()){
            child = childRepository.findById(regNumber).get();

            child.setName(childBody.getName());
            child.setPlaceOfBirth(childBody.getPlaceOfBirth());
            child.setDateOfBirth(childBody.getDateOfBirth());
            child.setWeight(childBody.getWeight());
            child.setGender(childBody.getGender());
            child.setMother(childBody.getMother());

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
