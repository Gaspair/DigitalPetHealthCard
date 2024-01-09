package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VetService {


    private VetStore vetStore;
    @Autowired
    public VetService(VetStore vetStore) {
        this.vetStore = vetStore;
    }
}
