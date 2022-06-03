package kaleyearest.project.models.DTO;

import com.sun.istack.NotNull;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class RegisterDTO {
    @NotBlank(message = "Email is Required")
    @Email(message = "Invalid email. Try Again.")
    private String email;

    @NotBlank(message = "Username is Required")
    @Size(min = 3 , max = 50)
    private String username;
    @NotBlank
    @NotNull
    @Size(min = 5, max = 30, message = "Invalid password. Must be between 5 and 30 characters.")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}