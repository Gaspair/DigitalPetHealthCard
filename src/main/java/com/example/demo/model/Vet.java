package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "vet", schema = "vet")
@Getter
@Setter
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class Vet {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "vet_id")
    private UUID vetID;

    @OneToMany(mappedBy = "vet")
    private List<Pet> petPatientsList;

}
