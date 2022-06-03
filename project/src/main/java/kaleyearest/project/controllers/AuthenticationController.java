package kaleyearest.project.controllers;

import kaleyearest.project.Data.UserRepository;
import kaleyearest.project.models.DTO.LoginDTO;
import kaleyearest.project.models.DTO.RegisterDTO;
import kaleyearest.project.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("/")
public class AuthenticationController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/registration")
    public ResponseEntity<Object> processRegistration(@RequestBody @Valid RegisterDTO registerDTO) {

        User existingUser = userRepository.findByUsername(registerDTO.getUsername());

        if (existingUser != null) {
            return ResponseEntity.badRequest().body("Username already exists!");
        }

        User user = new User(registerDTO.getEmail(), registerDTO.getUsername(), registerDTO.getPassword());
        userRepository.save(user);

        return ResponseEntity.status(HttpStatus.OK).body(user);
    }


    @PostMapping("/login")
    public ResponseEntity<Object> processLogin(@RequestBody @Valid LoginDTO loginDTO) {

        User user = userRepository.findByUsername(loginDTO.getUsername());

        if (user == null) {
            return ResponseEntity.badRequest().body("Username does not exist!");
        }

        String password = loginDTO.getPassword();

        if (!user.isMatchingPassword(password)) {
            return ResponseEntity.badRequest().body("Invalid password!");
        }

        return ResponseEntity.status(HttpStatus.OK).body(user);    }
}

