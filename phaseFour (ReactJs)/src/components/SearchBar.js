import {Form} from 'react-bootstrap'

const SearchBar = ({onChange}) => {
  return (
    <div className='Search-Div'>
        <Form.Control 
          className="Search-Bar" 
          placeholder="Search Pokémon..." 
          type="search" 
          id="search" 
          onChange={onChange}
          size='lg'
        />
    </div>
  )
}

export default SearchBar