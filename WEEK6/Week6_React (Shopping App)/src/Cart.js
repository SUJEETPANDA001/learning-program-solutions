// src/Cart.js
import React from 'react';

class Cart extends React.Component {
  render() {
    const { itemname, price } = this.props;
    return (
      <div style={{ border: '1px solid #ccc', margin: '10px', padding: '10px' }}>
        <h3>Item: {itemname}</h3>
        <p>Price: ₹{price}</p>
      </div>
    );
  }
}

Cart.defaultProps = {
  itemname: 'Unknown Item',
  price: '0'
};

export default Cart;