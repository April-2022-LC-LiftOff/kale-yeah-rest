package kaleyearest.project.resources;

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

import java.util.Arrays;


@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("/planning")
public class MealPlanningResource {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.key}")
    private String apiKey;

    @RequestMapping("/{dayOrWeek}")
    public String getMeals(@PathVariable("dayOrWeek") String dayOrWeek) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        //Endpoint fetches meal plans for the day or week
        return restTemplate.exchange("https://api.spoonacular.com/mealplanner/generate?timeFrame=" + dayOrWeek + "&apiKey=" + apiKey, HttpMethod.GET, entity, String.class).getBody();
    }
}
