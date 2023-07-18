import {Card, Col, ProgressBar, Row} from 'react-bootstrap'
import { useState } from 'react'
import PokemonCardModal from './PokemonCardModal'

const PokemonCard = ({data}) => {

  const [showModal, setshowModal] = useState(false)

  const handleClose = () => {
    setshowModal(false);
  }

  return (
    <>
    <Card className='Card' onClick={()=>{setshowModal(true)}}>
    <Card.Img src = {data.sprites.other.dream_world.front_default} alt = {data.name} height={100}/>
    <Card.Body>
        <Card.Title>
            {data.name.toUpperCase()}
        </Card.Title>
        <Card.Subtitle>
          type : {data.types[0].type.name.toUpperCase()}
        </Card.Subtitle>
        <Card.Text>
          <br/>
          <Row>
            <Col sm={4} className='card-stat-label'>
              HP
            </Col>
            <Col sm={8} className='card-stat-bar'>
            <ProgressBar striped animated className='stat-bar' variant='success' now={data.stats[0].base_stat}/>
            </Col>
          </Row>
          <Row>
            <Col sm={4} className='card-stat-label'>
              Attack
            </Col>
            <Col sm={8} className='card-stat-bar'>
            <ProgressBar striped animated className='stat-bar' variant='danger' now={data.stats[1].base_stat}/>
            </Col>
          </Row>
          <Row>
            <Col sm={4} className='card-stat-label'>
              Defense
            </Col>
            <Col sm={8} className='card-stat-bar'>
            <ProgressBar striped animated className='stat-bar' variant='info' now={data.stats[2].base_stat}/>
            </Col>
          </Row>
        </Card.Text>
    </Card.Body>
    </Card> 
    <PokemonCardModal data={data} showModal={showModal} handleClose={handleClose} name={data.name}/>
    </>
  )
}
export default PokemonCard