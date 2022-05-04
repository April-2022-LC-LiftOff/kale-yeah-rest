package kaleyearest.project.Data;

import kaleyearest.project.models.Recipes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipesRepository extends CrudRepository<Recipes,Integer> {

}