package kaleyearest.project.resources;



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
//import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;


//@RestController
//@RequestMapping("/ingredients")
//public class IngredientsResource {
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Value("${api.key}")
//    private String apiKey;
//
//    @RequestMapping("/{name}")
//    public String getIngredientsList(@PathVariable("name") String name) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity <String> entity = new HttpEntity<String>(headers);
//        //Search for simple whole foods (e.g. fruits, vegetables, nuts, grains, meat, fish, dairy etc.).
//        return restTemplate.exchange("https://api.spoonacular.com/food/ingredients/search?query=" + name + "&apiKey=" + apiKey, HttpMethod.GET, entity, String.class).getBody();
//    }
//
//
//}

