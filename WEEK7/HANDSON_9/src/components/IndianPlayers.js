import React from 'react';

const T20players = ['Virat', 'Rohit', 'Gill'];
const RanjiTrophyPlayers = ['Pujara', 'Rahane', 'Jadeja'];

const allPlayers = [...T20players, ...RanjiTrophyPlayers];

const IndianPlayers = () => {
  const oddPlayers = [];
  const evenPlayers = [];

  allPlayers.forEach((player, index) => {
    if ((index + 1) % 2 === 0) {
      evenPlayers.push(player);
    } else {
      oddPlayers.push(player);
    }
  });

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {allPlayers.map(p => (
          <li key={p}>{p}</li>
        ))}
      </ul>

      <h2>Odd Team Players</h2>
      <ul>
        {oddPlayers.map(p => (
          <li key={p}>{p}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenPlayers.map(p => (
          <li key={p}>{p}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;