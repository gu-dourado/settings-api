package br.com.fiap.settings.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_preferences")
@Data
@NoArgsConstructor
public class Preferences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "preferences")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categories_id")
    private Categories categories;

    private String theme;
}
