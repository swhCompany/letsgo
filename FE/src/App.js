import './App.css';
import Header from './components/Layout/Header';
import Banner from './components/Banner/Banner';
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import Search from './components/Search/Search';

function App() {



  return (
    <BrowserRouter>
        <div className="App">
          <Header />
          <Routes>
            <Route path="/" element={<><Banner/><Search/></>}/>
          </Routes>
         
        </div>
    </BrowserRouter>

  );
}
export default App;