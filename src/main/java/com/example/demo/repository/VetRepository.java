package com.example.demo.repository;

import com.example.demo.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VetRepository extends JpaRepository<Vet, UUID> {
}
