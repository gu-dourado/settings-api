package br.com.fiap.settings.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Mail {
    @Id
    private Long id;

    private User sender;
    private List<Category> categories;
    private String title;
    private String body;
}
