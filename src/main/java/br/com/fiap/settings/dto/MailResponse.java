package br.com.fiap.settings.dto;

public record MailResponse (
        Long senderId,
        String user,
        String category,
        String title,
        String body
) {
}
