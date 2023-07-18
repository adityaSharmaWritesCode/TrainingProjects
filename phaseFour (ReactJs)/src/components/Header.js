import logo from './assets/Pokemon-Logo.png'

const Header = () => {
  return (
    <header className="Header">
        <img src={logo} alt = 'Pokemon' height="200"/>
    </header>
  )
}

export default Header