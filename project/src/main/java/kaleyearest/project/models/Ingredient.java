package kaleyearest.project.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
public class Ingredient extends AbstractEntity {
    @JsonProperty("groceryId")
    public String groceryId;
    @NotBlank(message= "Ingredient name is required")
    @Size(min = 3, max = 50)
    @JsonProperty("name")
    public String name;


    @ManyToOne
    @JoinColumn(name = "grocery_list_id")
    private GroceryList groceryList;

//    @ManyToOne
//    @JoinColumn(name = "recipes_id")
//    private Recipes recipes;
//
//    public Recipes getRecipes() {
//        return recipes;
//    }

    public GroceryList getGroceryList() {
        return groceryList;
    }

    public Ingredient(String name, String groceryId) {
        this.name = name;
        this.groceryId = groceryId;

    }

    public Ingredient() {};

    public String getGroceryId() {
        return groceryId;
    }

    public void setGroceryId(String groceryId) {
        this.groceryId = groceryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}