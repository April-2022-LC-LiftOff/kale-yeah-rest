package kaleyearest.project.resources;

import kaleyearest.project.models.Recipes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("/recipes")
public class RecipesResource {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.key}")
    private String apiKey;

    @RequestMapping("/{queryValue}")
    public String getIngredientsList(@PathVariable("queryValue") String queryValue) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        //method combines searching by query, by ingredients, and by nutrients into one endpoint.
        return restTemplate.exchange("https://api.spoonacular.com/recipes/complexSearch?query=" + queryValue + "&apiKey=" + apiKey, HttpMethod.GET, entity, String.class).getBody();
    }
}
