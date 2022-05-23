package kaleyearest.project.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class GroceryList extends AbstractEntity {

    @OneToMany
    @NotBlank(message= "Items are required")
    private List<Ingredient> items = new ArrayList<>();

    @OneToOne
    @NotNull(message = "User is required")
    private User user;

    @NotNull(message = "Date required")
    private Date date;

    private boolean isCompleted = false;

    public GroceryList(List<Ingredient> items, User user, Date date) {
        this.items = items;
        this.user = user;
        this.date = date;

    }

    public GroceryList(){}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Ingredient> getItems() {
        return items;
    }

    public void setItems(List<Ingredient> items) {
        this.items = items;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted() {
        this.isCompleted = true;
    }
}
