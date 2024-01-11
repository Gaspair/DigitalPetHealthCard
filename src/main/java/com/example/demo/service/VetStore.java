package com.example.demo.service;

import com.example.demo.model.Vet;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface VetStore {

    ResponseEntity<?> getVetByID(UUID vetID);

    ResponseEntity<?> getPatientsList(UUID vetID);

    ResponseEntity<?> saveVet(Vet vet);

    ResponseEntity<?> delete(UUID vetID);
}
