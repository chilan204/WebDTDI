package com.example.webcty.entities.aboutUsPage;

import com.example.webcty.entities.bases.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "about_us_banner")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AboutUsBanner extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dtdi")
    @SequenceGenerator(name = "dtdi", sequenceName = "DTDI", allocationSize = 1)
    private Long id;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String slogan;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String image;
}