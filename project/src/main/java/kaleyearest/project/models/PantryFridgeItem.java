package kaleyearest.project.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



@Entity
public class PantryFridgeItem extends AbstractEntity {

    @OneToOne
    @NotBlank(message= "Ingredient is required")
    private Ingredient ingredient;

    @NotNull
    private int quantity;

    @NotNull
    private String expirationDate;


    @ManyToOne
    @JoinColumn(name = "pantry_id")
    private Pantry pantry;

    public Pantry getPantry() {
        return pantry;
    }

    public PantryFridgeItem(Ingredient ingredient, int quantity, String expirationDate) {
        this.ingredient = ingredient;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public PantryFridgeItem() {}

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredients(Ingredient ingredient) {
        this.ingredient = ingredient;
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
