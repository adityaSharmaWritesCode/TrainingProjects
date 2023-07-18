import './App.css';
import {useEffect, useState} from 'react'
import Header from './components/Header';
import SearchBar from './components/SearchBar';
import PokemonList from './components/PokemonList';
import Pagination from './components/Pagination';
import {Alert, Spinner} from 'react-bootstrap';  

function App() {

  const numOfPokemon = 1000 // variable number of pokemon can be fetched
  
  const url = `https://pokeapi.co/api/v2/pokemon/?limit=${numOfPokemon}`

  const [searchInput, setSearchInput] = useState('')
  const [pokemonData, setPokemonData] = useState([])
  const [isLoading, setIsLoading] = useState(true)
  const [currentPage, setCurrentPage] = useState(1)
  const cardsPerPage = 10
    
  function createPokemonObject(result) {
    result.forEach(async (pokemon) => {
      const res = await fetch(
        `https://pokeapi.co/api/v2/pokemon/${pokemon.name}`
      );
      const data = await res.json();
      setPokemonData((currentList) => [...currentList, data]);
    });
  }

  const fetchData = async () => {
    try {  
      setIsLoading(true)
      setPokemonData([])
      const res = await fetch(url)
      const data = await res.json()

    createPokemonObject(data.results);

    setIsLoading(false)
    } catch (e) {
      <Alert variant='danger'>{e}</Alert>
      console.log(e)
    }
  }

  useEffect(() => {  
    fetchData()
    // console.log(pokemonData)
  }, [])

  const searchPokemon = (e) => {
    e.preventDefault()
    setSearchInput(e.target.value.toLowerCase())
  }
  
  // PAGINATION LOGIC : 

  // getting current pokemon
  const indexOfLastPokemon = currentPage * cardsPerPage;
  const indexOfFirstPokemon = indexOfLastPokemon - cardsPerPage;
  const currentPokemon = pokemonData.slice(indexOfFirstPokemon, indexOfLastPokemon);

  // Change page
  const paginate = (pageNumber) => setCurrentPage(pageNumber);
  const handlePrevPage = () => {currentPage > 1 && setCurrentPage(currentPage - 1)}
  const handleNextPage = () => {currentPage < Math.ceil(numOfPokemon / cardsPerPage) && setCurrentPage(currentPage + 1)}

  return (
    <div className="App">
      {
      isLoading 
        ? <div className='Loading-Indicator'>
          <Spinner variant='dark'/>
          <br/>
          <h4>Loading PokéDex</h4>
        </div>
        : <>
          <Header/>
          <SearchBar onChange = {searchPokemon}/>
          <PokemonList 
            input = {searchInput} 
            data = {pokemonData} 
            currentData = {currentPokemon}
            isLoading={isLoading}
            />
          <Pagination 
            cardsPerPage = {cardsPerPage} 
            totalCards = {pokemonData.length} 
            currPage={currentPage}
            paginate={paginate}
            handlePrev={handlePrevPage}
            handleNext={handleNextPage}
            disappear={isLoading || searchInput.length > 0}
            />
          </>
      }
    </div>
  );
}

export default App;