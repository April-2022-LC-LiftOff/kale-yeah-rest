import axios from 'axios';

// const RECIPES_REST_API_URL = "http://localhost:8080/recipes/{queryValue}";

let fetchRecipesUrl = (queryValue) => `http://localhost:8080/recipes/${queryValue}`;

class RecipesService {

    getRecipes() {
      return axios.get(fetchRecipesUrl("Pasta"))  
    }
}

export default new RecipesService()