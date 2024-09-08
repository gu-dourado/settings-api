package br.com.fiap.settings.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_users")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String mailAddress;
    private String password;

    @OneToOne
    @JoinColumn(name = "preferences_id")
    private Preferences preferences;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Mail> mails = new ArrayList<>();
}


