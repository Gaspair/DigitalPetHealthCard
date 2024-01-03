package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
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

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "last_modified_date")
    private Date lastModifiedDate;
}
