package kaleyearest.project.Data;

import kaleyearest.project.models.Pantry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PantryRepository extends CrudRepository<Pantry,Integer> {

}
