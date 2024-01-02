package com.example.demo.controller;

import com.example.demo.model.Owner;
import com.example.demo.service.OwnerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("api/v1/owner")
public class OwnerController {


    private OwnerService ownerService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneByUUID(@PathVariable("id") UUID ownerID) {
        return ownerService.getOwnerByID(ownerID);
    }

    @PostMapping("")
    public ResponseEntity<?> saveOwner(@RequestBody Owner owner) {
        return ownerService.saveOwner(owner);
    }




}
