import React, { useState } from 'react';
import './Register.css';

function Register() {
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    password: ''
  });

  const [errors, setErrors] = useState({});

  const handleChange = (e) => {
    setFormData({ 
      ...formData, 
      [e.target.name]: e.target.value 
    });
  };

  const validate = () => {
    const newErrors = {};
    if (formData.name.length < 5) {
      newErrors.name = 'Name must be at least 5 characters';
    }
    if (!formData.email.includes('@') || !formData.email.includes('.')) {
      newErrors.email = 'Email must contain @ and .';
    }
    if (formData.password.length < 8) {
      newErrors.password = 'Password must be at least 8 characters';
    }
    return newErrors;
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const validationErrors = validate();
    setErrors(validationErrors);

    if (Object.keys(validationErrors).length === 0) {
      alert('Registration successful!');
      setFormData({ name: '', email: '', password: '' });
    }
  };

  return (
    <form onSubmit={handleSubmit} className="register-form">
      <label>Name:</label>
      <input 
        type="text" 
        name="name" 
        value={formData.name} 
        onChange={handleChange} 
      />
      {errors.name && <span className="error">{errors.name}</span>}

      <label>Email:</label>
      <input 
        type="email" 
        name="email" 
        value={formData.email} 
        onChange={handleChange} 
      />
      {errors.email && <span className="error">{errors.email}</span>}

      <label>Password:</label>
      <input 
        type="password" 
        name="password" 
        value={formData.password} 
        onChange={handleChange} 
      />
      {errors.password && <span className="error">{errors.password}</span>}

      <button type="submit">Register</button>
    </form>
  );
}

export default Register;
