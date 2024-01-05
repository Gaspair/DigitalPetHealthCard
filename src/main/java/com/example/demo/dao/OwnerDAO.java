package com.example.demo.dao;


import com.example.demo.model.Owner;
import com.example.demo.repository.OwnerRepository;
import com.example.demo.service.OwnerStore;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Transactional
public class OwnerDAO implements OwnerStore {

    private final OwnerRepository ownerRepository;

    @Autowired
    public OwnerDAO(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public ResponseEntity<?> getOwnerByID(UUID ownerID) {
        return ResponseEntity.status(HttpStatus.OK).body(ownerRepository.findById(ownerID));
    }

    @Override
    public ResponseEntity<?> getPetList(UUID ownerID) {
        return ResponseEntity.status(HttpStatus.OK).body(ownerRepository.findByOwnerID(ownerID));
    }

    @Override
    public ResponseEntity<?> save(Owner owner) {
        return ResponseEntity.status(HttpStatus.OK).body(ownerRepository.save(owner));

    }

    @Override
    public ResponseEntity<?> delete(UUID ownerID) {
        ownerRepository.deleteById(ownerID);
        return ResponseEntity.status(HttpStatus.OK).body("Account deleted");

    }
}
