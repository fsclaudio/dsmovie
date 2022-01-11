import {ReactComponent as GitHubIcon} from 'assets/img/gitlogo.svg';
import './styles.css'
function Navibar(){
    return(
        <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <h1>DSMovie</h1>
          <a href="https://github.com/fsclaudio">
          <div className="dsmovie-contact-container">
            <GitHubIcon />
            <p className="dsmovie-contact-link">/devsuperior</p>
          </div>
          </a>
        </div>
      </nav>
    </header>
    )
}
export default Navibar;