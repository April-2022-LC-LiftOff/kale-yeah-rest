package kaleyearest.project.resources;



import kaleyearest.project.models.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;


@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("/ingredients")
public class IngredientsResource {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.key}")
    private String apiKey;

    @RequestMapping("/{name}")
    public Results getIngredientsList(@PathVariable("name") String name) {

        Results results = restTemplate.getForObject("https://api.spoonacular.com/food/ingredients/search?query=" + name + "&apiKey=" + apiKey, Results.class);
        return results;

    }


}

