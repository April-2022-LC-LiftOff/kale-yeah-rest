// import React from 'react';
// import TriviaService from '../services/TriviaService';

// class TriviaComponent extends React.Component {
//     constructor(props) {
//         super(props)
//         this.state = {
//             trivia: []
//         }
//     }

//     componentDidMount() {
//         TriviaService.getTrivia().then((response) => {
//             this.setState({trivia: response.data})
//         });
//     }
//     render() {
//         return(
//             <div>
//                 <h1 className='text-center'>Trivia</h1>
//                 <table className='table table-striped'>
//                     <thead>
//                         <tr>
//                             <td>Trivia Info</td>
//                         </tr>
//                     </thead>
//                     <tbody>
//                         {
//                             this.state.trivia.map(
//                                 random =>
//                                 <tr key ={random.text}>
//                                     <td>{random.text}</td>
//                                 </tr>
//                             )
//                         }
//                     </tbody>

//                 </table>




//             </div>
//         )
//     }
// }

// export default TriviaComponent;