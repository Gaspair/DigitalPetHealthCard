package com.example.demo.service;

import com.example.demo.model.Owner;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface OwnerStore {

    ResponseEntity<?> getOwnerByID(UUID ownerID);


    ResponseEntity<?> getPetList(UUID ownerID);

    ResponseEntity<?> save(Owner owner);
}
