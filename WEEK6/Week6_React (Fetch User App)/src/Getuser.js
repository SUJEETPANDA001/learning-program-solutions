import React, { Component } from 'react';

class Getuser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      user: null,
      loading: true,
      error: null
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch('https://api.randomuser.me/');
      const data = await response.json();
      const user = data.results[0];
      this.setState({ user, loading: false });
    } catch (error) {
      this.setState({ error: 'Failed to fetch user', loading: false });
    }
  }

  render() {
    const { user, loading, error } = this.state;

    if (loading) return <p>Loading user...</p>;
    if (error) return <p>{error}</p>;

    return (
      <div style={{ textAlign: 'center' }}>
        <h2>User Details</h2>
        <p>{user.name.title} {user.name.first}</p>
        <img src={user.picture.large} alt="User" />
      </div>
    );
  }
}

export default Getuser;