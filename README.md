# JavaFX Checker Game

## Overview
The **JavaFX Checker Game** is a grid-based game application built using JavaFX. It features an interactive board where users can add and remove graphical objects (such as circles) by clicking on the grid. The project demonstrates object-oriented programming principles and JavaFX capabilities for creating graphical user interfaces (GUIs).

## Features
- Interactive grid board with alternating colors.
- Ability to click on a grid square to add a graphical object.
- User interface with:
    - Input fields for specifying row and column numbers.
    - A button to remove elements from the grid.
- Customizable board size and square properties.

## Components
This project consists of several Java classes:

### 1. `GameApp`
- The main class that initializes and launches the JavaFX application.
- Handles user interactions and updates the graphical interface.

### 2. `Board`
- Manages the grid layout and interactions.
- Draws the board and calculates positions of grid squares.

### 3. `Rectangle`
- Represents individual squares on the board.
- Handles graphical rendering of rectangles.

### 4. `Circle`
- Represents circular graphical elements.
- Encapsulates attributes such as radius, fill color, and border color.

### 5. `Green`
- Represents custom graphical objects that can be added to the board.
- Uses the `Circle` class for rendering.

## Requirements
- **Java 11** or higher.
- **JavaFX SDK** (download from [OpenJFX](https://openjfx.io/)).
- IntelliJ IDEA or any other Java IDE.

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/justtcallmejayy/JavaFX-Checker-Game.git
   cd JavaFX-Checker-Game
   ```

2. **Open in IntelliJ IDEA**:
    - Open the cloned folder as a project in IntelliJ IDEA.

3. **Add JavaFX SDK**:
    - Go to **File > Project Structure > Libraries**.
    - Add the `lib` folder from your JavaFX SDK directory.

4. **Configure VM Options**:
    - Go to **Run > Edit Configurations**.
    - Add the following VM options:
      ```
      --module-path <path-to-javafx-sdk>/lib --add-modules javafx.controls,javafx.fxml
      ```

5. **Run the Application**:
    - Build and run the `GameApp` class.

## Usage
- Click on the grid to add a `Green` object (circle) to a square.
- Use the input fields to specify a square's row and column.
- Click the "Remove" button to remove objects from the grid.

## Project Structure
```
JavaFX-Checker-Game/
├── src/
│   ├── GameApp.java
│   ├── Board.java
│   ├── Rectangle.java
│   ├── Circle.java
│   └── Green.java
├── .gitignore
├── README.md
└── package.bluej
```

## Contributing
Feel free to fork this repository and submit pull requests for enhancements or bug fixes.

## Acknowledgments
- Built using **JavaFX**.
- Special thanks to [OpenJFX](https://openjfx.io/) for providing JavaFX resources.

---

Enjoy the game and happy coding!
