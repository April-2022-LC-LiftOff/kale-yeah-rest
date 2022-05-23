package kaleyearest.project.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Ingredient extends AbstractEntity {

    @NotBlank(message= "Ingredient name is required")
    @Size(min = 3, max = 50)
    private String name;

    @NotBlank
    @Size(min = 3 , max = 50)
    private String category;

    private double price;

    private int calories;

    public Ingredient(String name, String category, double price, int calories) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.calories = calories;
    }

    public Ingredient() {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}