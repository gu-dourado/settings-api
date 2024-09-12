package br.com.fiap.settings.controller;

import br.com.fiap.settings.model.Mail;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/mail")

public class MailController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Mail getMail(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Mail> getMails() {
        return null;
    }

    @DeleteMapping("/{mailId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMail(@PathVariable Long id) {
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Mail updateMail(@RequestBody Mail mail) {
        return null;
    }
}
