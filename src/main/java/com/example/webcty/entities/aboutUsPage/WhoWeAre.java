package com.example.webcty.entities.aboutUsPage;

import com.example.webcty.entities.bases.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "who_we_are")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WhoWeAre extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dtdi")
    @SequenceGenerator(name = "dtdi", sequenceName = "DTDI", allocationSize = 1)
    private Long id;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String title;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String description;
}