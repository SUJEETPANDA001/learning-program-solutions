import React, { useState } from "react";

function CurrencyConverter() {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  const handleConvert = (e) => {
    e.preventDefault();
    const result = (parseFloat(rupees) / 88).toFixed(2); // assuming 1 Euro = 88 INR
    setEuro(result);
  };

  return (
    <div>
      <h2>Currency Converter</h2>
      <input
        type="number"
        placeholder="Enter amount in INR"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleConvert}>Convert</button>
      {euro && <p>{rupees} INR = {euro} Euro</p>}
    </div>
  );
}

export default CurrencyConverter;
