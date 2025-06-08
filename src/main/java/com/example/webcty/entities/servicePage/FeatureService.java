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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "your_seq_name")
    @SequenceGenerator(name = "your_seq_name", sequenceName = "YOUR_SEQ_IN_DB", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String description;
}