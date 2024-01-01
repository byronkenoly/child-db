package com.byron.children.service;

import com.byron.children.entities.Mother;
import com.byron.children.repository.MotherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotherService {

    private final MotherRepository motherRepository;

    public MotherService(MotherRepository motherRepository){
        this.motherRepository = motherRepository;
    }

    public void saveMother(Mother mother){
        motherRepository.save(mother);
    }

    public List<Mother> getAllMother(){
        return motherRepository.findAll();
    }
}
