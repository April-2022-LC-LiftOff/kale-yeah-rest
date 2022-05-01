package kaleyearest.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Objects;

@Entity
public class Recipes {

    @Id
    @GeneratedValue
    private int id;


    @Min(0)
    private int recipeYield;

    @NotBlank
    @Size(min = 3, max = 20)
    private String category;


    private HashMap<Integer,String> recipeIngredients = new HashMap<>();

    @NotBlank
    private String recipeInstructions;

    @NotBlank
    @Size(min = 3, max = 20)
    private String cookingMethod;

    @Min(0)
    private int calories;

    public Recipes() {};

    public Recipes(int recipeYield, String category, HashMap<Integer, String> recipeIngredients, String recipeInstructions, String cookingMethod, int calories) {
        this.recipeYield = recipeYield;
        this.category = category;
        this.recipeIngredients = recipeIngredients;
        this.recipeInstructions = recipeInstructions;
        this.cookingMethod = cookingMethod;
        this.calories = calories;
    }

    public int getId() {
        return id;
    }


    public int getRecipeYield() {
        return recipeYield;
    }

    public void setRecipeYield(int recipeYield) {
        this.recipeYield = recipeYield;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public HashMap<Integer, String> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(HashMap<Integer, String> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public String getRecipeInstructions() {
        return recipeInstructions;
    }

    public void setRecipeInstructions(String recipeInstructions) {
        this.recipeInstructions = recipeInstructions;
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
        return getId() == recipes.getId() && getRecipeYield() == recipes.getRecipeYield() && getCalories() == recipes.getCalories() && getCategory().equals(recipes.getCategory()) && getRecipeIngredients().equals(recipes.getRecipeIngredients()) && getRecipeInstructions().equals(recipes.getRecipeInstructions()) && getCookingMethod().equals(recipes.getCookingMethod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRecipeYield(), getCategory(), getRecipeIngredients(), getRecipeInstructions(), getCookingMethod(), getCalories());
    }
}
