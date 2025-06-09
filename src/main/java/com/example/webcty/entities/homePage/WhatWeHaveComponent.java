package com.example.webcty.entities.homePage;

import com.example.webcty.entities.bases.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "what_we_have_component")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WhatWeHaveComponent extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dtdi")
    @SequenceGenerator(name = "dtdi", sequenceName = "DTDI", allocationSize = 1)
    private Long id;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String title;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String description;

    @Column(columnDefinition = "CLOB", nullable = false )
    private String image;

    @ElementCollection
    @CollectionTable(
            name = "what_we_have_component_tags",
            joinColumns = @JoinColumn(name = "what_we_have_component_id")
    )
    @Column(name = "tags", nullable = false)
    private List<String> tags;
}