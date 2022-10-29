
import './App.css';
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router,Routes,  Link , Route } from "react-router-dom";

import AddTutorial from "./components/AddTutorial.jsx"
import Tutorial from "./components/Tutorial"
import TutorialList from "./components/TutorialList.jsx"


function App() {
  return (
    
      <Router>
        <nav className='navbar navbar-expand '>
          <a href='/tutorials' className='navbar-brand'>Vihanga_M</a>
          <div className='navbar-nav mr-auto'>
            <li className='nav-item'>
              <Link to={"/tutorials"} className="nav-link"> Tutorial
              </Link>
            </li>
            <li className='nav-item'>
              <Link to={"/add"} className="nav-link"> Add Tutorial
              </Link>
            </li>
          </div>
        </nav>
        <div className='container mt-3'>
          <Routes>
            <Route exact path={["/","tutorials"]} component={TutorialList}/>
            <Route exact path='/add' component={AddTutorial}/>
            <Route exact path='/tutorials/:id' component={Tutorial}/>
          </Routes>
        </div>
      </Router>
  );
}

export default App;
