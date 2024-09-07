package br.com.fiap.settings.controller;

import br.com.fiap.settings.model.Mail;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("")

public class MailController {

    @GetMapping("/mail/{mailId}")
    @ResponseStatus(HttpStatus.OK)
    public Mail getMail(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/mail")
    @ResponseStatus(HttpStatus.OK)
    public List<Mail> getMails() {
        return null;
    }

    @PostMapping("/mail")
    @ResponseStatus(HttpStatus.CREATED)
    public Mail registerMail(@RequestBody Mail mail) {
        return null;
    }

    @DeleteMapping("/mail/{mailId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMail(@PathVariable Long id) {
    }

    @PutMapping("/mail")
    @ResponseStatus(HttpStatus.OK)
    public Mail updateMail(@RequestBody Mail mail) {
        return null;
    }
}
