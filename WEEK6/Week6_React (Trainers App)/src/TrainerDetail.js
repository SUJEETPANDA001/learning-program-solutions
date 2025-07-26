// src/TrainerDetail.js
import './TrainerDetail.css';
import { useParams } from "react-router-dom";
import trainers from './TrainersMock';

function TrainerDetail() {
  const { id } = useParams();
  // Use 'id' for both possible keys
  const trainer = trainers.find(
    t => t.id === parseInt(id) || t.trainerId === parseInt(id)
  );

  if (!trainer) return <p>Trainer not found</p>;

  return (
    <div className="trainer-detail">
      <h2>{trainer.name}</h2>
      <p>Email: {trainer.email}</p>
      <p>Phone: {trainer.phone}</p>
      <p>
        {trainer.subject
          ? `Subject: ${trainer.subject}`
          : `Technology: ${trainer.technology}`}
      </p>
      <p>Skills: {trainer.skills.join(", ")}</p>
      {trainer.bio && <p>Bio: {trainer.bio}</p>}
      {trainer.avatar && (
        <img
          src={trainer.avatar}
          alt={trainer.name}
          className="trainer-avatar"
          style={{ marginTop: "1rem" }}
        />
      )}
    </div>
  );
}

export default TrainerDetail;