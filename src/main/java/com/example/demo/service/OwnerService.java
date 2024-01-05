package com.example.demo.service;

import com.example.demo.model.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OwnerService {

    @Autowired
    private OwnerStore ownerStore;


    public ResponseEntity<?> getOwnerByID(UUID ownerID){
        return ownerStore.getOwnerByID(ownerID);
    }

    public ResponseEntity<?> getOwnerPetList(UUID ownerID){
        return ownerStore.getPetList(ownerID);
    }

    public ResponseEntity<?> saveOwner(Owner owner) {
        return ownerStore.save(owner);

    }

    public ResponseEntity<?> deleteOwner(UUID ownerID) {
        return ownerStore.delete(ownerID);
    }


}
