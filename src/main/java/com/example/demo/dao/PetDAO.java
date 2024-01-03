package com.example.demo.dao;

import com.example.demo.model.Pet;
import com.example.demo.repository.OwnerRepository;
import com.example.demo.repository.PetRepository;
import com.example.demo.service.PetStore;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

public class PetDAO implements PetStore {

    private OwnerRepository ownerRepository;
    private PetRepository petRepository;

    public PetDAO(OwnerRepository ownerRepository, PetRepository petRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
    }

    @Override
    public ResponseEntity<?> getPetByID(UUID petID) {
        return ResponseEntity.status(HttpStatus.OK).body(petRepository.findById(petID));
    }

    @Override
    public ResponseEntity<?> getOwnerList(UUID petID) {
        Optional<Pet> pet = petRepository.findById(petID);
        return ResponseEntity.status(HttpStatus.OK).body(ownerRepository.findById(pet.get().getOwner().getOwnerID()));
    }

    @Override
    public ResponseEntity<?> save(Pet pet) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(UUID petID) {
        return null;
    }
}
