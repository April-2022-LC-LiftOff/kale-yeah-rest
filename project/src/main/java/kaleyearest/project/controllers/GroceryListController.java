package kaleyearest.project.controllers;

import kaleyearest.project.Data.GroceryListRepository;
import kaleyearest.project.Data.IngredientsRepository;
import kaleyearest.project.models.DTO.GroceryListDTO;
import kaleyearest.project.models.GroceryList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Optional;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("/")
public class GroceryListController {

    @Autowired
    private GroceryListRepository groceryListRepository;

    @Autowired
    private IngredientsRepository ingredientsRepository;


    @GetMapping("/view-list/{id}")
    public Optional<GroceryList> getGroceryList(@PathVariable int id) {
        Optional<GroceryList> newGroceryList = groceryListRepository.findById(id);
        return newGroceryList;
    }

    @ResponseBody
    @PostMapping("/view-list")
    public int groceryList(@RequestBody @Valid GroceryList groceryList)  {
        GroceryList groceryList1 = new GroceryList(groceryList.getItems());
        groceryListRepository.save(groceryList1);
        int groceryListId = groceryList1.getId();
        return groceryListId;
    }




}
