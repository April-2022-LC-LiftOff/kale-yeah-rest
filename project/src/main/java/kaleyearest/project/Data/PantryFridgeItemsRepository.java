package kaleyearest.project.Data;

import kaleyearest.project.models.PantryFridgeItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PantryFridgeItemsRepository extends CrudRepository<PantryFridgeItem, Integer> {

}