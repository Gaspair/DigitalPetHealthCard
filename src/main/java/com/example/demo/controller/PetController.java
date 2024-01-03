package com.example.demo.controller;

import com.example.demo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;

public class PetController {

    private PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }


}
