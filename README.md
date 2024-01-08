# Text-Based Restaurant System

Welcome to the Text-Based Restaurant System, a simple yet effective Java application designed to simulate a restaurant's order and tab management system. This system is built using fundamental object-oriented programming concepts and design patterns, making it an excellent resource for students and beginners in Java programming.

## Features

- **Menu Display**: Users can view a list of available dishes along with their prices.
- **Order Submission**: Allows users to submit orders based on the menu.
- **Tab Display**: Users can view their current tab, including all ordered items and the total cost.
- **Observer Pattern**: Implements the Observer design pattern to update the tab whenever a new order is placed.

## How It Works

The system operates through a command-line interface where users can choose from various options like displaying the menu, submitting an order, and viewing their tab. The core components of the system include:

- `Aggregator`: A singleton class that aggregates the main components of the system.
- `Command Pattern`: Utilizes the Command design pattern for handling different actions.
- `Menu`: Manages the list of menu items available for order.
- `Orders`: Handles the collection of ordered items.
- `Tab`: Keeps track of the user's orders and total cost.

## Getting Started

To run the Text-Based Restaurant System, follow these steps:

1. Clone the repository to your local machine.
2. Compile and run the `Restaurant.java` file.
3. Interact with the system through the command-line interface.

## Contributing

Contributions to the Text-Based Restaurant System are welcome. Please feel free to fork the repository, make your changes, and create a pull request.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
