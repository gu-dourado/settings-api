package br.com.fiap.settings.repository;

import br.com.fiap.settings.model.Preferences;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreferencesRepository extends JpaRepository<Preferences, Long> {

}

