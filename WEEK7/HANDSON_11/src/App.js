import React from "react";
import Counter from "./components/Counter";
import Welcome from "./components/Welcome";
import SyntheticEvent from "./components/SyntheticEvent";
import CurrencyConverter from "./components/CurrencyConverter";

function App() {
  return (
    <div className="App">
      <h1>Event Handling in React</h1>
      <Counter />
      <Welcome />
      <SyntheticEvent />
      <CurrencyConverter />
    </div>
  );
}

export default App;
