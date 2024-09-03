package br.com.fiap.settings.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Preferences {
    @Id
    private Long id;

    private List<Category> categories;
    private String theme;
}