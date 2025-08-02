import React from 'react';
import EmployeeCard from './EmployeeCard';

const employees = [
  { id: 1, name: 'Sujeet Panda', position: 'Developer' },
  { id: 2, name: 'Monalisha Swain', position: 'QA Engineer' },
  { id: 3, name: 'Tanaya Dash', position: 'Tester' },
];

function EmployeeList() {
  return (
    <div>
      <h2>Employee List</h2>
      {employees.map(emp => (
        <EmployeeCard key={emp.id} employee={emp} />
      ))}
    </div>
  );
}

export default EmployeeList;
