import './App.css';
import IngredientComponent from './components/IngredientComponent';
import RecipesComponent from './components/RecipesComponent';
import UserComponent from './components/UserComponent';

function App() {
  return (
    <div className="App">
      <UserComponent/> <IngredientComponent/> <RecipesComponent/>
    </div>
  );
}

export default App;
