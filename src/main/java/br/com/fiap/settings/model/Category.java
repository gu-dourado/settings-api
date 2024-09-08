package br.com.fiap.settings.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_categories")
@Data
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean all;
    private Boolean education;
    private Boolean family;
    private Boolean important;
    private Boolean advertising;
    private Boolean social;
}
