import React from "react";

function Welcome() {
  const greet = (msg) => {
    alert(`Message: ${msg}`);
  };

  return (
    <div>
      <button onClick={() => greet("Welcome")}>Say Welcome</button>
    </div>
  );
}

export default Welcome;
