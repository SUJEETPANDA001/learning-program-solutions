import logo from './logo.svg';
import './App.css';

import React, { useState } from 'react';
import Guest from './components/Guest';
import User from './components/User';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const toggleLogin = () => setIsLoggedIn(!isLoggedIn);

  return (
    <div className="App">
      <h1>✈️ Ticket Booking App</h1>
      <button onClick={toggleLogin}>
        {isLoggedIn ? 'Logout' : 'Login'}
      </button>
      <hr />
      {isLoggedIn ? <User /> : <Guest />}
    </div>
  );
}

export default App;
