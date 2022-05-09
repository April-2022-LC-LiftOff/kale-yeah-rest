package kaleyearest.project.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Ingredients extends AbstractEntity {

    @NotBlank(message= "Ingredient name is required")
    @Size(min = 3, max = 50)
    private String name;

    @NotBlank
    @Size(min = 3 , max = 50)
    private String category;

    @ManyToOne
    @NotNull(message = "User is required")
    private User user;

    public Ingredients() {};

    public Ingredients(String name, String category, User user) {
        this.name = name;
        this.category = category;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

}