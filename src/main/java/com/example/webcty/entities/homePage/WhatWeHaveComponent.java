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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "your_seq_name")
    @SequenceGenerator(name = "your_seq_name", sequenceName = "YOUR_SEQ_IN_DB", allocationSize = 1)
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