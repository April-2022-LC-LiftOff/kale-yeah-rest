import axios from 'axios';

// const INGREDIENT_REST_API_URL = "http://localhost:8080/ingredients/{name}";

let fetchNameUrl = (name) => `http://localhost:8080/ingredients/${name}`;

class IngredientService {

    getIngredient() {
      return axios.get(fetchNameUrl("pizza"))  
    }
}

export default new IngredientService()