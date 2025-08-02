import React, { useState } from 'react';
import './ComplaintRegister.css';

function ComplaintRegister() {
  const [employeeName, setEmployeeName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const referenceNumber = Math.floor(100000 + Math.random() * 900000);
    alert(`Thank you, ${employeeName}! Your complaint has been submitted.\nReference No: ${referenceNumber}`);
    setEmployeeName('');
    setComplaint('');
  };

  return (
    <form onSubmit={handleSubmit} className="complaint-form">
      <label>Employee Name:</label>
      <input
        type="text"
        value={employeeName}
        onChange={(e) => setEmployeeName(e.target.value)}
        required
      />

      <label>Complaint:</label>
      <textarea
        value={complaint}
        onChange={(e) => setComplaint(e.target.value)}
        required
      />

      <button type="submit">Submit</button>
    </form>
  );
}

export default ComplaintRegister;
