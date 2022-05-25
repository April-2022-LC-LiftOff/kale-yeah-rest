package kaleyearest.project.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Recipes extends AbstractEntity {


    @NotBlank(message = "Recipe name is required")
    private String name;

    @OneToMany(mappedBy = "recipes")
    @NotBlank
    private List<Ingredient> ingredients = new ArrayList<>();

    @Min(0)
    private int yield;

    @NotBlank
    @Size(min = 3, max = 20)
    private String category;

    @NotBlank
    private String instructions;

    @NotBlank
    @Size(min = 3, max = 20)
    private String cookingMethod;

    @Min(0)
    private int calories;

    @ManyToOne
    @NotNull(message = "User is required")
    private User user;

    public Recipes(String name, List<Ingredient> ingredients, int yield, String category, String instructions, String cookingMethod, int calories, User user) {
        this.name = name;
        this.yield = yield;
        this.category = category;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.cookingMethod = cookingMethod;
        this.calories = calories;
        this.user = user;
    }

    public Recipes() {};

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRecipeName() {
        return name;
    }

    public void setRecipeName(String name) {
        this.name = name;
    }

    public int getYield() {
        return yield;
    }

    public void setYield(int yield) {
        this.yield = yield;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Ingredient> getRecipeIngredients() {
        return ingredients;
    }

    public void setRecipeIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getCookingMethod() {
        return cookingMethod;
    }

    public void setCookingMethod(String cookingMethod) {
        this.cookingMethod = cookingMethod;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipes)) return false;
        Recipes recipes = (Recipes) o;
        return getId() == recipes.getId() && getYield() == recipes.getYield() && getCalories() == recipes.getCalories() && getCategory().equals(recipes.getCategory()) && getRecipeIngredients().equals(recipes.getRecipeIngredients()) && getInstructions().equals(recipes.getInstructions()) && getCookingMethod().equals(recipes.getCookingMethod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getYield(), getCategory(), getRecipeIngredients(), getInstructions(), getCookingMethod(), getCalories());
    }
}
