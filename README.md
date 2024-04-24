# Java Tic Tac Toe

## Description
This is a simple Tic Tac Toe game implemented in Java using classes. The game allows two players to take turns marking spaces on a 3x3 grid with their respective symbols (usually 'X' and 'O') until one player wins by getting three of their symbols in a row horizontally, vertically, or diagonally, or the grid is full resulting in a draw.

## Features
- Classic Tic Tac Toe gameplay.
- Two-player mode.
- Proper validation of user input to ensure moves are legal.
- Detection of winning conditions and declaration of the winner.
- Option to play again after a game ends.

## Requirements
- Java Development Kit (JDK) installed on your system.

## Usage
1. Clone or download the repository to your local machine.
2. Navigate to the directory containing the source code.
3. Compile the Java files using the following command:
    ```
    javac *.java
    ```
4. Run the compiled program with the following command:
    ```
    java TicTacToe
    ```
5. Follow the on-screen instructions to play the game. Players will take turns entering coordinates to mark their symbol on the grid.

## Implementation Details
- The game is implemented using object-oriented principles.
- There are two main classes: `Game` and `Board`.
    - `Game`: Manages the game flow, player turns, input validation, and win/draw conditions.
    - `Board`: Represents the game board and handles drawing the board, marking spaces, and checking for win/draw conditions.
- Input validation is performed to ensure that players enter valid coordinates within the grid and that they do not attempt to mark already occupied spaces.
- Win conditions are checked after each move to determine if a player has won the game.
- If there is no winner and the grid is full, the game declares a draw.

## Future Improvements
- Implementing a graphical user interface (GUI) for a more interactive playing experience.
- Adding support for different grid sizes and winning conditions.
- Implementing an AI opponent for single-player mode.

## Contribution
Contributions are welcome! If you have any ideas for improvements or find any issues, feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
