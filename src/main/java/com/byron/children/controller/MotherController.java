package com.byron.children.controller;

import com.byron.children.entities.Mother;
import com.byron.children.service.MotherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MotherController {

    private final MotherService motherService;

    public MotherController(MotherService motherService){
        this.motherService = motherService;
    }

    @PostMapping("/addmother")
    public void saveChild(@RequestBody Mother mother){
        motherService.saveMother(mother);
    }

    @GetMapping("/allmother")
    public List<Mother> findAllMother(){
        return motherService.getAllMother();
    }
}
