// import data from './Data.json'
import PokemonCard from "./PokemonCard";

const PokemonList = ({input, data, currentData, isLoading}) => {

    if(isLoading) {
        return <h2>Loading ...</h2>
    }

    const filteredList = data.filter((pl)=>{
        if(input === ''){
            return pl;
        } else {
            return pl.name.toLowerCase().includes(input)
        } 
    })

  return (
    <div className="List-Container">
        { input.length === 0 ? 
            currentData.map((item) => 
            (<PokemonCard  data = {item}/>)) :
                    filteredList.length === 0 ? 
                    <div className="not-found-div">
                        <br/>
                        <h4>NO POKEMON FOUND</h4>
                        <p>Oops! Seems the PokéDex can't help you catch this one!<br/>
                        Better luck next time!</p>
                    </div> : 
                    filteredList.map((item) => 
                    (<PokemonCard data = {item}  />))  
        }
    </div>
  )
}

export default PokemonList