package kaleyearest.project.models;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Entity
public class GroceryList extends AbstractEntity {

    @NotBlank(message= "Ingredient is required")
    private String ingredient;

    @Min(0)
    private double price;

    public GroceryList(String ingredient, double price) {
        this.ingredient = ingredient;
        this.price = price;
    }

    public GroceryList(){}

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
