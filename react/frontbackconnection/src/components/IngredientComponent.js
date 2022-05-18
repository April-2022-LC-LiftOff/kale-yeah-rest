import React from "react";
import IngredientService from '../services/IngredientService' ;

class IngredientComponent extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            ingredients: []
        }
    }
    componentDidMount() {
        IngredientService.getIngredient().then((response) => {
            this.setState({ingredients: response.data})
        });

    }

    // componentDidMount() {
        //     IngredientService.then((response) => {
        //         const ingredients = response.data;
        //         this.setState({ ingredients })
        //     });
        
    render() {
        return(
            <div>
                <h1 className='text-center'>Ingredients List</h1>
                <table className='table table-striped'>
                    <thead>
                        <tr>
                            <td>Id</td>
                            <td>Name</td>
                            <td>Image</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.ingredients.map(
                                ingredient =>
                                <tr key ={ingredient.results.id}>
                                    <td>{ingredient.results.id}</td>
                                    <td>{ingredient.resname}</td>
                                    <td>{ingredient.image}</td>
                                </tr>
                            )
                        }
                    </tbody>

                </table>




            </div>
        )
    }
}

export default IngredientComponent;