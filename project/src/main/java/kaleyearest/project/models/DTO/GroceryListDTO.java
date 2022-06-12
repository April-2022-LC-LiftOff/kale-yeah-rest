package kaleyearest.project.models.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import kaleyearest.project.models.Ingredient;
import java.io.Serializable;
import java.util.List;
public class GroceryListDTO  {

    public List<Ingredient> items;


    public List<Ingredient> getItems() {
        return items;
    }

    public void setItems(List<Ingredient> items) {
        this.items = items;
    }
}
