package br.com.fiap.settings.repository;

import br.com.fiap.settings.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
