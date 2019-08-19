package waffles.data;

import org.springframework.data.repository.CrudRepository;

import waffles.Ingredient;

public interface IngredientRepository 
         extends CrudRepository<Ingredient, String> {

}
