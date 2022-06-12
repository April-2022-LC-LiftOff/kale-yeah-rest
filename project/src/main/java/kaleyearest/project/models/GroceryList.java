package kaleyearest.project.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class GroceryList extends AbstractEntity {
    @ElementCollection
    @OneToMany(cascade=CascadeType.ALL, mappedBy = "groceryList")
    private List<Ingredient> items = new ArrayList<>();



    public GroceryList(List<Ingredient> items) {
        this.items = items;

    }

    public GroceryList(){}



    public List<Ingredient> getItems() {
        return items;
    }

    public void setItems(List<Ingredient> items) {
        this.items = items;
    }


    //    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public boolean isCompleted() {
//        return isCompleted;
//    }
//
//    public void setCompleted() {
//        this.isCompleted = true;
//    }
}
