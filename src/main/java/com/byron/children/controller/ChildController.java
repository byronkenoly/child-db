package com.byron.children.controller;

import com.byron.children.entities.Child;
import com.byron.children.service.ChildService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChildController {

    private final ChildService childService;

    public ChildController(ChildService childService){
        this.childService = childService;
    }

    @PostMapping("/addchild")
    public void saveChild(@RequestBody Child child){
        childService.saveChild(child);
    }

    @PutMapping("/editchild/{regNumber}")
    public void editchild(@PathVariable String regNumber, @RequestBody Child child){
        childService.editChildByRegNumber(regNumber, child);
    }

    @GetMapping("/search/")
    public ResponseEntity<Child> findChild(@RequestParam String name){
        var child = childService.findChildByName(name);

        return child.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/allchildren")
    public List<Child> findAllChild(){
        return childService.getAllChildren();
    }

}
