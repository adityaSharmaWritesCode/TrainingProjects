import {Button} from 'react-bootstrap'

const Pagination = ({cardsPerPage, currPage, totalCards, paginate, handlePrev, handleNext, disappear}) => {
        const pageNumbers = [];
        const totalPages = Math.ceil(totalCards / cardsPerPage)
        for(let i = 1; i <= totalPages; i++){
            pageNumbers.push(i);
        }

    return (
        !disappear && 
        <>
        <p className='footer-text'>Page <b>{currPage}</b> of <b>{totalPages}</b></p>
        <nav className='Footer'>
            <ul className="pagination">
                <Button className='page-button' variant={currPage===1 ? 'outline-secondary' : 'success'} id="previous" onClick={() => handlePrev()} disabled={currPage===1}>Prev</Button>
                {
                    totalPages <= 20 && 
                    pageNumbers.map((number) => (
                        <li key={number} className="page-item">
                            <Button variant={currPage===number ? 'success' :'outline-success'}
                                onClick={() => paginate(number)} 
                            >
                                    {number}
                            </Button>
                        </li>
                    ))
                }
                <Button className='page-button' variant={currPage===totalPages ? 'outline-secondary' : 'success'} id="next" onClick={() => handleNext()} disabled={currPage === totalPages}>Next</Button> 
            </ul>
        </nav>
        </>
    )
    }

    export default Pagination