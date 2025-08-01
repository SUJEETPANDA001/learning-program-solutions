import logo from './logo.svg';
import './App.css';
import { Home } from './Components/Home';
import { About } from './About';
import { Contact } from './Contact';

function App() {
  return (
    <div className="App">
      <Home />
      <About />
      <Contact />
    </div>
  );
}

export default App;