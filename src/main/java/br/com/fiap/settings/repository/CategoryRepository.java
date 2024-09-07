package br.com.fiap.settings.repository;

import br.com.fiap.settings.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
