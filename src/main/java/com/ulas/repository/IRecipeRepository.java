package com.ulas.repository;

import com.ulas.repository.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecipeRepository  extends JpaRepository<Recipe,Long> {

}
