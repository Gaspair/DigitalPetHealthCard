package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "owner", schema = "own")
@Getter
@Setter
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class Owner {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "owner_id")
    private UUID ownerID;

    @OneToMany(mappedBy = "owner")
    private List<Pet> petsList;



}
