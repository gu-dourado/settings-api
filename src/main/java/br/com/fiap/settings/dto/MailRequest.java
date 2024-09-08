package br.com.fiap.settings.dto;

public record MailRequest(
        Long id,
        Long senderId,
        String user,
        String category,
        String title,
        String body
) {
}
