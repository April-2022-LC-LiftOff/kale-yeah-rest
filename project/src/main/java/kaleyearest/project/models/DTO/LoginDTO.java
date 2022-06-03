package kaleyearest.project.models.DTO;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginDTO {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

