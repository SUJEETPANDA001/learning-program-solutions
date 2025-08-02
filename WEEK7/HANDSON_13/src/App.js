import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [active, setActive] = useState("book");

  const renderComponent = () => {
    switch (active) {
      case "book":
        return <BookDetails />;
      case "blog":
        return <BlogDetails />;
      case "course":
        return <CourseDetails />;
      default:
        return <h3>Select a component</h3>;
    }
  };

  return (
    <div style={{ textAlign: 'center' }}>
      <h1>Blogger App</h1>
      <div style={{ marginBottom: 20 }}>
        <button onClick={() => setActive("book")}>Book</button>
        <button onClick={() => setActive("blog")}>Blog</button>
        <button onClick={() => setActive("course")}>Course</button>
      </div>
      {renderComponent()}
    </div>
  );
}

export default App;
