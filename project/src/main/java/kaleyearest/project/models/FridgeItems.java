package kaleyearest.project.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



@Entity
public class FridgeItems extends AbstractEntity {

    @NotBlank(message= "Ingredient is required")
    private String ingredients;

    @NotBlank(message = "Category is Required")
    private String category;

    @NotNull
    private int quantity;

    @NotNull
    private String expirationDate;

    public FridgeItems(String ingredients, String category, int quantity, String expirationDate) {
        this.ingredients = ingredients;
        this.category = category;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public FridgeItems() {}

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }


}
