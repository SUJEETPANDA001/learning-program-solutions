import React from "react";
import "./Home.css";

function Home() {
  return (
    <div className="home-container">
      <h1>Welcome to Trainers App</h1>
      <p>
        Discover expert trainers in React, Java, Python, and more.<br />
        Click "Trainers" above to browse profiles and find your perfect mentor!
      </p>
      <img
        src="https://images.unsplash.com/photo-1513258496099-48168024aec0?auto=format&fit=crop&w=600&q=80"
        alt="Training"
        className="home-image"
      />
    </div>
  );
}

export default Home;