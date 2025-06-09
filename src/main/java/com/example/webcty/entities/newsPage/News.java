package com.example.webcty.entities.newsPage;

import com.example.webcty.entities.bases.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "news")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class News extends BaseEntity {
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

    @Column(nullable = false, columnDefinition = "CLOB")
    private String image;

    @Column(name = "order_index", unique = true)
    private Integer orderIndex;
}