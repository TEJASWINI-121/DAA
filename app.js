const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');

const app = express();
const PORT = 3000;

// Middleware
app.use(bodyParser.json());

// Connect to MongoDB (make sure MongoDB is running locally or provide your connection string)
mongoose.connect('mongodb://localhost:27017/bankApp', {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});

// Define schema and model
const userSchema = new mongoose.Schema({
  name: String,
  accountNumber: String,
  email: String,
  mobile: String,
  balance: Number,
});

const User = mongoose.model('User', userSchema);

// Routes

// Create new user (POST)
app.post('/users', async (req, res) => {
  try {
    const newUser = new User(req.body);
    await newUser.save();
    res.status(201).send({ message: 'User created', user: newUser });
  } catch (err) {
    res.status(400).send(err);
  }
});

// Update user by id (PUT)
app.put('/users/:id', async (req, res) => {
  try {
    const updatedUser = await User.findByIdAndUpdate(
      req.params.id,
      req.body,
      { new: true }
    );
    if (!updatedUser) return res.status(404).send({ message: 'User not found' });
    res.send({ message: 'User updated', user: updatedUser });
  } catch (err) {
    res.status(400).send(err);
  }
});

// Delete user by id (DELETE)
app.delete('/users/:id', async (req, res) => {
  try {
    const deletedUser = await User.findByIdAndDelete(req.params.id);
    if (!deletedUser) return res.status(404).send({ message: 'User not found' });
    res.send({ message: 'User deleted', user: deletedUser });
  } catch (err) {
    res.status(400).send(err);
  }
});

// Get all users (GET)
app.get('/users', async (req, res) => {
  try {
    const users = await User.find();
    res.send(users);
  } catch (err) {
    res.status(500).send(err);
  }
});

// Start server
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
