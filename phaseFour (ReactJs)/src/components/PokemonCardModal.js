import React from 'react'
import { Col, Modal, ProgressBar, Row } from 'react-bootstrap'

const PokemonCardModal = ({data, showModal, handleClose}) => {

  return (
    <Modal className='pokemon-modal' show={showModal} onHide={handleClose} centered size='sm'>
    <Modal.Header closeButton>
        <Modal.Title id={data.id}>
            {data.name.toUpperCase()}
        </Modal.Title>
    </Modal.Header>
    <Modal.Body>
        <img src={data.sprites.other.dream_world.front_default} alt = {data.name} className='modal-img'/>
        <hr/>
            <h5>
                <i>Type : </i> 
                {data.types.length === 1 
                ? data.types[0].type.name.toUpperCase() 
                : data.types[0].type.name.toUpperCase() + ', ' + data.types[1].type.name.toUpperCase()}
            </h5>
        <p>
            <i>Height </i> : {data.height*10} cm<br/>
            <i>Weight </i> : {Math.ceil(data.weight*0.1)} kg <br/>
            <hr/>
            <Row>
                <Col className='card-stat-label' sm={3}>
                    HP 
                </Col>
                <Col sm={2}>
                    {data.stats[0].base_stat}
                </Col>
                <Col sm={7}>
                    <ProgressBar striped animated className='stat-bar' variant='success' now={data.stats[0].base_stat}/>
                </Col>
            </Row>
            <Row>
                <Col className='card-stat-label' sm={3}>
                    Attack
                </Col>
                <Col sm={2}>
                    {data.stats[1].base_stat}
                </Col>
                <Col sm={7}>
                    <ProgressBar striped animated className='stat-bar' variant='danger' now={data.stats[1].base_stat}/>
                </Col>
            </Row>
            <Row>
                <Col className='card-stat-label' sm={3}>
                    Defense
                </Col>
                <Col sm={2}>
                    {data.stats[2].base_stat}
                </Col>
                <Col sm={7}>
                    <ProgressBar striped animated className='stat-bar' variant='info' now={data.stats[2].base_stat}/>
                </Col>
            </Row>
            <Row>
                <Col className='card-stat-label' sm={3}>
                    Speed
                </Col>
                <Col sm={2}>
                    {data.stats[5].base_stat}
                </Col>
                <Col sm={7}>
                    <ProgressBar striped animated className='stat-bar' variant='warning' now={data.stats[5].base_stat}/>
                </Col>
            </Row>
        </p>
    </Modal.Body>
  </Modal>
  )
}

export default PokemonCardModal