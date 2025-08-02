import React, { useContext } from 'react';
import ThemeContext from '../ThemeContext';

function EmployeeCard({ employee }) {
  const theme = useContext(ThemeContext);

  return (
    <div className={`card ${theme}`}>
      <h3>{employee.name}</h3>
      <p>{employee.position}</p>
      <button className={`btn ${theme}`}>Message</button>
    </div>
  );
}

export default EmployeeCard;
