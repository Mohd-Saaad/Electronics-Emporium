package com.electronix.Emphorium.repository;

import com.electronix.Emphorium.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
