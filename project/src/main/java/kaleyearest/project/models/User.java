package kaleyearest.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;


@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Username is Required")
    @Size(min = 3 , max = 50)
    private String username;

    @NotBlank(message = "Email is Required")
    @Email(message = "Invalid email. Try Again.")
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public User() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}