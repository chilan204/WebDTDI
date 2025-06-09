package com.example.webcty.entities.homePage;

import com.example.webcty.entities.bases.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "home_intro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HomeIntro extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dtdi")
    @SequenceGenerator(name = "dtdi", sequenceName = "DTDI", allocationSize = 1)
    private Long id;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String title;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String description;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String content;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String image;
}