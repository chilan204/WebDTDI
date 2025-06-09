package com.example.webcty.entities.homePage;

import com.example.webcty.entities.bases.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "our_partner_component")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OurPartnerComponent extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dtdi")
    @SequenceGenerator(name = "dtdi", sequenceName = "DTDI", allocationSize = 1)
    private Long id;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String name;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String logo;
}