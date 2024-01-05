package com.example.demo.repository;

import com.example.demo.model.Owner;
import com.example.demo.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OwnerRepository extends JpaRepository<Owner, UUID> {

    List<Pet> findByOwnerID(UUID ownerID);
}
