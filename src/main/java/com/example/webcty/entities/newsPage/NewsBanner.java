package com.example.webcty.entities.newsPage;

import com.example.webcty.entities.bases.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "news_banner")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NewsBanner extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dtdi")
    @SequenceGenerator(name = "dtdi", sequenceName = "DTDI", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String slogan;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String image;
}