package kaleyearest.project.resources;

import kaleyearest.project.models.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/recipes")
public class RecipesResource {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.key}")
    private String apiKey;

    @RequestMapping("/{queryValue}")
    public Results getRecipes(@PathVariable("queryValue") String queryValue) {

        Results results = restTemplate.getForObject("https://api.spoonacular.com/recipes/complexSearch?query=" + queryValue + "&apiKey=" + apiKey, Results.class);
        return results;
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<String> entity = new HttpEntity<String>(headers);
//        //method combines searching by query, by ingredients, and by nutrients into one endpoint.
//        return restTemplate.exchange("https://api.spoonacular.com/recipes/complexSearch?query=" + queryValue + "&apiKey=" + apiKey, HttpMethod.GET, entity, String.class).getBody();
    }
}
