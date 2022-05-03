package kaleyearest.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Ingredients {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank
    @Size(min = 3, max = 50)
    private String name;

    @NotBlank
    @Size(min = 3 , max = 50)
    private String category;


    @Min(0)
    private int calories;

    public Ingredients() {};

    public Ingredients(String name, String category, int calories) {
        this.name = name;
        this.category = category;
        this.calories = calories;
    }

    public int getId() {
        return id;
    }

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

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredients)) return false;
        Ingredients that = (Ingredients) o;
        return getId() == that.getId() && getCalories() == that.getCalories() && getName().equals(that.getName()) && getCategory().equals(that.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCategory(), getCalories());
    }

}
