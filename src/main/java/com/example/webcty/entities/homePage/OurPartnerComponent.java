package com.example.webcty.entities.homePage;

import com.example.webcty.entities.bases.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "our_partner_component")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OurPartnerComponent extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "your_seq_name")
    @SequenceGenerator(name = "your_seq_name", sequenceName = "YOUR_SEQ_IN_DB", allocationSize = 1)
    private Long id;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String name;

    @Column(columnDefinition = "CLOB", nullable = false)
    private String logo;
}