package com.example.webcty.entities.projectPage;

import com.example.webcty.entities.bases.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "project_component")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProjectComponent extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dtdi")
    @SequenceGenerator(name = "dtdi", sequenceName = "DTDI", allocationSize = 1)
    private Long id;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String title;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String description;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String image;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String content;
}