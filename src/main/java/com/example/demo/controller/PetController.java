package com.example.demo.controller;

import com.example.demo.model.Pet;
import com.example.demo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/pet")
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneByUUID(@PathVariable("id") UUID petID){
        return petService.getPetByID(petID);
    }

    @PostMapping("/")
    public ResponseEntity<?> savePet(@RequestBody Pet pet){
        return petService.savePet(pet);
    }

    @DeleteMapping("/deletePet/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") UUID petID) {
        return petService.deletePet(petID);
    }

}
