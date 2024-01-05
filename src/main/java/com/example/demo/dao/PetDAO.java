package com.example.demo.dao;

import com.example.demo.model.Pet;
import com.example.demo.repository.PetRepository;
import com.example.demo.service.PetStore;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@Transactional
public class PetDAO implements PetStore {

    private final PetRepository petRepository;

    public PetDAO( PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public ResponseEntity<?> getOneByID(UUID petID) {
        return ResponseEntity.status(HttpStatus.OK).body(petRepository.findById(petID));
    }

    @Override
    public ResponseEntity<?> getOwnerList(UUID petID) {


        return ResponseEntity.status(HttpStatus.OK).body(petRepository.findByPetID(petID));
    }

    @Override
    public ResponseEntity<?> save(Pet pet) {
        petRepository.save(pet);
        return ResponseEntity.status(HttpStatus.OK).body("Pet Saved");

    }

    @Override
    public ResponseEntity<?> delete(UUID petID) {
        Optional<Pet> pet = petRepository.findById(petID);

        if (pet.isPresent()) {
            petRepository.delete(pet.get());
            return ResponseEntity.status(HttpStatus.OK).body("Pet deleted");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pet not found");

    }
}
