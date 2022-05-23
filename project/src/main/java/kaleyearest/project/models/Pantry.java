package kaleyearest.project.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pantry extends AbstractEntity{

    @OneToMany
    private List<PantryFridgeItem> items = new ArrayList<>();

    @OneToOne
    private User user;

    public Pantry(List<PantryFridgeItem> items, User user) {
        this.items = items;
        this.user = user;
    }

    public Pantry() {}

    public List<PantryFridgeItem> getItems() {
        return items;
    }

    public void setItems(List<PantryFridgeItem> items) {
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
