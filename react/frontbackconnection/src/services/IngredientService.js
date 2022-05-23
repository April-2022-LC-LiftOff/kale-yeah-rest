import axios from 'axios';

const INGREDIENT_REST_API_URL = "http://localhost:8080/ingredients/{name}";

class IngredientService {

    getIngredient() {
      return axios.get(INGREDIENT_REST_API_URL)  
    }
}

export default new IngredientService()