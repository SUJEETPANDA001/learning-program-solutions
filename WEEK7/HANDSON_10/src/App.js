import React from 'react';
import './App.css';

function App() {
  const officeList = [
    {
      id: 1,
      name: 'WeWork, Bangalore',
      rent: 45000,
      address: 'Koramangala, Bangalore',
      image: 'https://c1.wallpaperflare.com/preview/790/460/867/residential-house-real-estate-property.jpg'
    },
    {
      id: 2,
      name: 'SmartSpace, Mumbai',
      rent: 62000,
      address: 'Andheri, Mumbai',
      image: 'https://c1.wallpaperflare.com/preview/472/565/102/apartment-complex-houston-texas-town-house-red.jpg'
    },
    {
      id: 3,
      name: 'CozyDesk, Delhi',
      rent: 58000,
      address: 'Connaught Place, Delhi',
      image: 'https://w0.peakpx.com/wallpaper/422/723/HD-wallpaper-best-farmhouse-in-panchgani-house-on-rent-in-panchgani-2bhk-house-on-rent-in-panchgani-famhouse-near-me.jpg'
    }
  ];

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>🏢 Office Space Rental App</h1>

      {officeList.map(office => (
        <div key={office.id} style={{ border: '1px solid #ccc', marginBottom: '15px', padding: '10px', borderRadius: '10px' }}>
          <h2>{office.name}</h2>
          <img src={office.image} alt={office.name} style={{ width: '250px', height: '150px' }} />
          <p><strong>Address:</strong> {office.address}</p>
          <p>
            <strong>Rent:</strong>{' '}
            <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
              ₹{office.rent}
            </span>
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
