package br.com.fiap.settings.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Category {
    @Id
    private Long id;

    private Boolean all;
    private Boolean education;
    private Boolean family;
    private Boolean important;
    private Boolean advertising;
    private Boolean social;
}
