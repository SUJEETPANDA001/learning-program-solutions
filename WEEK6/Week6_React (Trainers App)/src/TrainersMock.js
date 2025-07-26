// src/TrainersMock.js

class Trainer {
  constructor({ id, name, email, phone, subject, skills, bio, avatar }) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.subject = subject;
    this.skills = skills;
    this.bio = bio;
    this.avatar = avatar;
  }
}

const trainers = [
  new Trainer({
    id: 1,
    name: "Akhil pani",
    email: "akhil@example.com",
    phone: "1234567890",
    subject: "React",
    skills: ["Hooks", "Routing", "State Management"],
    bio: "Akhil is a passionate React trainer with 5 years of experience.",
    avatar: "https://randomuser.me/api/portraits/women/1.jpg"
  }),
  new Trainer({
    id: 2,
    name: "akhil pani",
    email: "akhil@example.com",
    phone: "0987654321",
    subject: "Java",
    skills: ["Spring", "Hibernate", "JPA"],
    bio: "Bob specializes in backend Java development and training.",
    avatar: "https://randomuser.me/api/portraits/men/2.jpg"
  }),
  new Trainer({
    id: 3,
    name: "parmita pani",
    email: "parmita@example.com",
    phone: "5551234567",
    subject: "Python",
    skills: ["Django", "Flask", "Data Science"],
    bio: "Carol loves teaching Python and data science to beginners.",
    avatar: "https://randomuser.me/api/portraits/women/3.jpg"
  })
];

export default trainers;