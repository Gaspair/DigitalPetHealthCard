package com.example.demo.dao;

import com.example.demo.repository.VetRepository;
import com.example.demo.service.VetStore;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class VetDAO implements VetStore {

    private final VetRepository vetRepository;

    public VetDAO(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }
}
