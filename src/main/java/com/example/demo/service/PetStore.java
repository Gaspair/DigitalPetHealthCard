package com.example.demo.service;

import com.example.demo.model.Owner;
import com.example.demo.model.Pet;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface PetStore {


    ResponseEntity<?> getPetByID(UUID petID);


    ResponseEntity<?> getOwnerList(UUID petID);

    ResponseEntity<?> save(Pet pet);

    ResponseEntity<?> delete(UUID petID);
}
