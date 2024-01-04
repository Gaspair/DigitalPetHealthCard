package com.example.demo.service;

import com.example.demo.model.Pet;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface PetStore {

    ResponseEntity<?> getOneByID(UUID petID);
    ResponseEntity<?> getOwnerList(UUID petID);

    ResponseEntity<?> save(Pet pet);

    ResponseEntity<?> delete(UUID petID);


}
