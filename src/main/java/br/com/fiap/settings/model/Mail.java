package br.com.fiap.settings.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_mails")
@Data
@NoArgsConstructor
public class Mail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Long senderId;

    @OneToOne
    @JoinColumn(name = "categories_id")
    private Category category;

    private String title;
    private String body;
}

