import axios from 'axios';

const TRIVIA_REST_API_URL = "http://localhost:8080/random/trivia";

class TriviaService {

    getTrivia() {
      return axios.get(TRIVIA_REST_API_URL)  
    }
}

export default new TriviaService()