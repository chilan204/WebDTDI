package com.example.webcty.entities.homePage;

import com.example.webcty.entities.bases.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "home_banner")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HomeBanner extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "your_seq_name")
    @SequenceGenerator(name = "your_seq_name", sequenceName = "YOUR_SEQ_IN_DB", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String slogan;

    @ElementCollection
    @CollectionTable(
            name = "home_banner_images",
            joinColumns = @JoinColumn(name = "home_banner_id")
    )
    @Column(name = "image_urls", nullable = false, columnDefinition = "CLOB")
    @Lob
    private List<String> imageUrls;
}