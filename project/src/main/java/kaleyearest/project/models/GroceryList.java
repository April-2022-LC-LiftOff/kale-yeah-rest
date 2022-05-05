package kaleyearest.project.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
public class GroceryList extends AbstractEntity {

    @NotBlank(message= "Ingredient is required")
    private String ingredient;

    @Min(0)
    private double price;

    @OneToOne
    @NotNull(message = "User is required")
    private User user;

    public GroceryList(String ingredient, double price, User user) {
        this.ingredient = ingredient;
        this.price = price;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
