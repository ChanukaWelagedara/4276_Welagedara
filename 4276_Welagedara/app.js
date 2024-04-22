const express = require('express');
const app = express();

// Mock data for train schedules
const trainSchedules = [
  {
    id: '1',
    trainNumber: 'T123',
    trainType: 'Express',
    departureStation: 'Station A',
    departureTime: '09:00 AM',
    arrivalStation: 'Station B',
    arrivalTime: '11:30 AM',
    ticketPrice: 25.5,
    seatsAvailable: 120,
  },
  {
    id: '2',
    trainNumber: 'T456',
    trainType: 'Local',
    departureStation: 'Station C',
    departureTime: '12:00 PM',
    arrivalStation: 'Station D',
    arrivalTime: '03:45 PM',
    ticketPrice: 15.75,
    seatsAvailable: 50,
  },
  {
    id: '3',
    trainNumber: 'T789',
    trainType: 'Express',
    departureStation: 'Station E',
    departureTime: '05:30 PM',
    arrivalStation: 'Station F',
    arrivalTime: '08:15 PM',
    ticketPrice: 30.0,
    seatsAvailable: 80,
  },
];

app.get('/', (req, res) => {
  res.json(trainSchedules);
});

module.exports = app;
