import React from 'react';

const players = [
  { name: 'Virat', score: 85 },
  { name: 'Rohit', score: 40 },
  { name: 'Gill', score: 90 },
  { name: 'Rahul', score: 65 },
  { name: 'Hardik', score: 35 },
  { name: 'Jadeja', score: 95 },
  { name: 'Bumrah', score: 88 },
  { name: 'Kuldeep', score: 60 },
  { name: 'Siraj', score: 75 },
  { name: 'Shami', score: 45 },
  { name: 'Ashwin', score: 82 },
];

const ListOfPlayers = () => {
  const filtered = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map(({ name, score }) => (
          <li key={name}>
            Mr. {name}: <span>{score}</span>
          </li>
        ))}
      </ul>

      <h2>Filtered Players (Score &lt; 70)</h2>
<ul>
  {filtered.map(({ name, score }) => (
    <li key={name}>
      {name} - {score}
    </li>
  ))}
</ul>

    </div>
  );
};

export default ListOfPlayers;