import React from 'react';
import RecipesService from '../services/RecipesService';

class RecipesComponent extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            recipes: []
        }
    }
    componentDidMount() {
        RecipesService.getRecipes().then((response) => {
            this.setState({recipes: response.data.results})
        });
    }
    render() {
        return(
            <div>
                <h1 className='text-center'>Recipes List</h1>
                <table className='table table-striped'>
                    <thead>
                        <tr>
                            <td>Id</td>
                            <td>Title </td>
                            <td>Image</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.recipes.map(
                                recipe =>
                                <tr key ={recipe.id}>
                                    <td>{recipe.id}</td>
                                    <td>{recipe.title}</td>
                                    <td>{recipe.image}</td>
                                </tr>
                            )
                        }
                    </tbody>

                </table>




            </div>
        )
    }
}
 
export default RecipesComponent;