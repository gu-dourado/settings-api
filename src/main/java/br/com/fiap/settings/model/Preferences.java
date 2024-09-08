package br.com.fiap.settings.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tbl_preferences")
@PrimaryKeyJoinColumn(name = "user_id")
@Data
@NoArgsConstructor
public class Preferences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long categoriesId;
    private String theme;
}