package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="pet", schema = "pet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pet {


    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy ="uuid2")
    @Column(name="pet_id")
    private UUID petID;

    @ManyToOne
    @JoinColumn(name="owner_id")
    private Owner owner;

    @Column(name = "pet_name")
    private String petName;

    @Column
    private Date  petBirthday;

    @Column(name = "pet_age")
    private String petAge;//poti sa setezi automat varsta scazand data de nastere la data actuala

}
