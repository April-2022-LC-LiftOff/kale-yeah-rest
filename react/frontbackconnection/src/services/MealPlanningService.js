import axios from 'axios';

const MEAL_PLANNING_REST_API_URL = "http://localhost:8080/planning/{dayOrWeek}";

class MealPlanningService {

    getMealPlanning() {
      return axios.get(MEAL_PLANNING_REST_API_URL)  
    }
}

export default new MealPlanningService()