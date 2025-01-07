# Tic-Tac-Toe
A simple Tic-Tac-Toe game implemented in Java

Tic-Tac-Toe Game

2. Introduction
The goal of this project is to develop a simple and interactive Tic-Tac-Toe game using Java. The game involves two players alternately marking spaces on a 3x3 grid. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game. If the grid is completely filled without any player achieving this, the game ends in a draw.

3. Objectives
Implement a playable Tic-Tac-Toe game with an interactive command-line interface.
Ensure the game validates user inputs and enforces rules like detecting invalid moves.
Automatically determine the game's winner or declare a draw when appropriate.
4. Features
Game Board: A 3x3 grid representing the Tic-Tac-Toe board.
Players: Two players (Player 1 and Player 2), where Player 1 is represented by 'o' and Player 2 by 'x'.
Input Handling: Players enter their moves via row and column indices.
Win Detection: The game detects winning conditions across rows, columns, and diagonals.
Draw Detection: The game declares a draw if all positions are filled without a winner.
Interactive Gameplay: Players are prompted for their moves, and the board is updated and displayed after each move.
5. Implementation Details
Programming Language: Java
Environment: Java SE Development Kit (JDK)
Tools: Command-line interface for execution

6. Code Explanation
Main Class:
The TicTacToe class manages the entire game logic, from input handling to winner detection.

Game Board:
The board is represented by a 2D array (int[3][3]).

0: Unoccupied cell
1: Marked by Player 1 (o)
2: Marked by Player 2 (x)
Key Functions:

makeMove(int row, int col): Updates the board, validates moves, and checks for winners or draws.
checkWinner(int row, int col): Determines if the latest move resulted in a win by analyzing rows, columns, and diagonals.
checkMoveValid(int row, int col): Validates whether a move is permissible (i.e., unoccupied cell).
togglePlayer(): Alternates the turn between players.
printBoard(): Displays the current state of the board.
Gameplay Flow:

The game starts by displaying an empty board.
Players take turns to make their moves by providing row and column indices.
After every move, the board is updated and printed. The game checks for a winner or a draw.
7. Challenges
Input Validation: Ensuring that players do not overwrite existing marks or input invalid indices.
Win Detection: Implementing logic to evaluate rows, columns, and diagonals for a win condition after each move.
