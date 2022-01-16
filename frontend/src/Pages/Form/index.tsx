
import FormCard from 'components/FormCard/index';
import { useParams } from 'react-router-dom';


function Form(){
    const params = useParams();
    return(
        <FormCard movieId={`${params.movieId}`}/> 
    )
}
export default Form;