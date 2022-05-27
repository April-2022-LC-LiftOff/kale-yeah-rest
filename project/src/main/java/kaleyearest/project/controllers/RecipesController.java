package kaleyearest.project.controllers;

import kaleyearest.project.Data.RecipesRepository;
import kaleyearest.project.models.Ingredient;
import kaleyearest.project.models.Recipes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("recipesdb/")
public class RecipesController {

    @Autowired
    private RecipesRepository recipesRepository;

    @GetMapping("recipes")
    public List<Recipes> getRecipes() {
        return (List<Recipes>) recipesRepository.findAll();
    }


    @GetMapping("recipes/{id}")
    public Optional<Recipes> getRecipe(@PathVariable int id) {
        Optional<Recipes> newRecipe = recipesRepository.findById(id);
        return newRecipe;
    }

    @PostMapping("recipes")
    Recipes newRecipe( @Valid @RequestBody Recipes newRecipe) {
        return recipesRepository.save(newRecipe);
    }


}
