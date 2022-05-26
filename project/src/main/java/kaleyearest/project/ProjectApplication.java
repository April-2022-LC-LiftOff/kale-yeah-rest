package kaleyearest.project;

import kaleyearest.project.Data.IngredientsRepository;
import kaleyearest.project.Data.RecipesRepository;
import kaleyearest.project.Data.UserRepository;
import kaleyearest.project.models.Ingredient;
import kaleyearest.project.models.Recipes;
import kaleyearest.project.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}


	@Autowired
	private UserRepository userRepository;

	@Autowired
	private IngredientsRepository ingredientsRepository;

	@Autowired
	private RecipesRepository recipesRepository;

	@Override
	public void run(String... args) throws Exception {
//		this.userRepository.save(new User("educia27","edd990@aol.com","Eduardo Cornelius"));
//		this.userRepository.save(new User("amg7v7","arnold@arnold.com","Andrew Ragnarson"));
//		this.userRepository.save(new User("frankthetank","frank@frankenstein.com","Frank Sinatra"));
//		this.userRepository.save(new User("adamSOS", "adam@lyft.com","Vince McMahon", "testing123"));
//		this.userRepository.save(new User("MickeyScott", "mike@dundermifflin.com","Michael Scott", "not123"));
//		this.userRepository.save(new User("adamSOS", "adam@centene.com","Edward Lionel", "always123"));

//		this.ingredientsRepository.save(new Ingredient("Kale","Vegetable", 1.99,33));
//		this.ingredientsRepository.save(new Ingredient("Milk","Dairy", 8.50,120));
//		this.ingredientsRepository.save(new Ingredient("Cereal","Carbohydrate", 5,160));

//		User newUser = new User("LilYachty", "yachty@enterprise.com","Miles Parks McCollum","yachtyVibes123");
//
//		Ingredient newIngredient = newIngredient("Chuck Beef" ,"Protein", 5 , 240);
//
//		List<Ingredient> ingredients = new ArrayList<>();
//
//		ingredients.add(newIngredient);
//
//		this.recipesRepository.save(new Recipes("Smash Burgers",ingredients, 5 , "Meat", "Fetch you some buns", "Frying Pan", 550, newUser));
//	}
//
//	private Ingredient newIngredient(String chuck_beef, String protein, int i, int i1) {
//		return new Ingredient();
//	}

	}
}
