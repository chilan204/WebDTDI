package com.example.webcty.entities.servicePage;

import com.example.webcty.entities.bases.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "feature_service")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FeatureService extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dtdi")
    @SequenceGenerator(name = "dtdi", sequenceName = "DTDI", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String description;
}