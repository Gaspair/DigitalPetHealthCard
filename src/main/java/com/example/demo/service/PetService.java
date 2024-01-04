package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PetService {

    @Autowired
    private PetStore petStore;


    public ResponseEntity<?> getPetByID(UUID petID) {
        return petStore.getOneByID(petID);
    }
}
