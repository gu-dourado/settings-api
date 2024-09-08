package br.com.fiap.settings.service;

import br.com.fiap.settings.model.Preferences;
import br.com.fiap.settings.repository.PreferencesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferencesService {

  @Autowired
  private PreferencesRepository preferencesRepository;

  public Preferences save(Preferences preferences) {
    return preferencesRepository.save(preferences);
  }

  public void delete(Long preferencesId) {
    preferencesRepository.deleteById(preferencesId);
  }
}
