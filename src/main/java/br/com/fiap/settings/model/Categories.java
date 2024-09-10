package br.com.fiap.settings.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_categories")
@Data
@NoArgsConstructor
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "all_categories")
    private Boolean allCategories;
    private Boolean education;
    private Boolean family;
    private Boolean important;
    private Boolean advertising;
    private Boolean social;
}
