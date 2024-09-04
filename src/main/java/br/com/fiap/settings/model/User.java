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
public class User {
    @Id
    private Long id;

    private String name, mailAddress, password;
    private Preferences preferences;
    private List<Mail> mails;
}

