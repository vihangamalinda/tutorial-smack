
import './App.css';
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter ,Routes,  Link , Route } from "react-router-dom";

import AddTutorial from "./components/AddTutorial.jsx"
import Tutorial from "./components/Tutorial"
import TutorialList from "./components/TutorialList.jsx"


function App() {
  return (
    
      <BrowserRouter>
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
            <Route  path="/tutorials" element={<TutorialList/>}/>
            <Route  path='/add' element={<AddTutorial/>}/>
            <Route  path='/tutorials/:id' element={<Tutorial/>}/>
          </Routes>
        </div>
      </BrowserRouter>
  );
}

export default App;
