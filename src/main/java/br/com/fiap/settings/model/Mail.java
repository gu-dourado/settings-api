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
    @JoinColumn(name = "receiver_id")
    private User receiver;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @OneToOne
    @JoinColumn(name = "categories_id")
    private Categories categories;

    private String title;
    private String body;
}

