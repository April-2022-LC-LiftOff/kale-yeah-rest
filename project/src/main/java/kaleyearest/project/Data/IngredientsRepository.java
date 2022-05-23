package kaleyearest.project.Data;

import kaleyearest.project.models.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends CrudRepository<Ingredient, Integer> {

}