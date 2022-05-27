package kaleyearest.project.controllers;

import kaleyearest.project.Data.UserRepository;
import kaleyearest.project.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping("user/{id}")
    public Optional<User> getUser(@PathVariable int id) {
        Optional<User> newUser = userRepository.findById(id);
        return newUser;
    }


}
