package kaleyearest.project.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    private String pwHash;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

//    @Transient
//    private Pantry pantry;

    @ElementCollection
    private List<GroceryList> groceryLists = new ArrayList();

//    @ElementCollection
//    private List<Recipes> favoriteRecipes = new ArrayList();

//    public Pantry getPantry() {
//        return pantry;
//    }
//
//    public Pantry getFridge() {
//        return pantry;
//    }

    public User(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public User() {}

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() && username.equals(user.username) && getEmail().equals(user.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), username, getEmail());
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }
}
