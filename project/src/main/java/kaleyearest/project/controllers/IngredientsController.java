package kaleyearest.project.controllers;

import kaleyearest.project.Data.IngredientsRepository;
import kaleyearest.project.models.Ingredient;
import kaleyearest.project.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("ingredientsdb/")
public class IngredientsController {

    @Autowired
    private IngredientsRepository ingredientsRepository;

    @GetMapping("ingredients")
    public List<Ingredient> getIngredients() {
        return (List<Ingredient>) ingredientsRepository.findAll();
    }

    @GetMapping("ingredients/{id}")
    public Optional<Ingredient> getIngredient(@PathVariable int id) {
        Optional<Ingredient> newIngredient = ingredientsRepository.findById(id);
        return newIngredient;
    }

    @PostMapping("ingredients")
    Ingredient newIngredient(@RequestBody Ingredient newIngredient) {
        return ingredientsRepository.save(newIngredient);
    }




}
