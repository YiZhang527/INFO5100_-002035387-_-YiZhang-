# Exercise-1a

## Program logic description: Number Guessing Game

### Program Start
- When the progam start, it shows "Welcome to guessing number game!" and menu.
- A scanner is used to get the input from the user.
- User input is stored in the choice variable.

### Menu Loop
- The program shows the menu repeatedly until the input is "2. Exit" through do-while loop:
  - Option 1: Start the game
  - Option 2: Exit
- The user enter the choice, and the switch statement will handle the input:
  If the user enters 1, the program calls the startGame() method.
  if the user enters 2, the program says "Good Bye!" and exits the do-while loop.
  if the user enters not 1 or 2, the program says "Wrong Choice! Please enter 1 or 2." through the default case of the switch statement.

### Game Logic (StartGame Method)
- A random number from 1 to 10 is generated as the answer through the Random method.
- The program will show "I have generated a number between 1 and 10. You have at most 5 attempts to guess it.", "Please enter the number between 1-10 you want to guess:".
- The user has up to 5 chances to guess the number.
- If the guess is equal to the answer, the program prints "Correct!" and ends the game.
- If the guess is greater than the answer, the program shows "Too high!".
- If the guess is smaller than the answer, the program shows "Too Low!".
- If the user does not guess the number within 5 chances, the program shows: "The correct number is X !".

### Program End

- When the user enter 2 to exit, the Scanner object is closed, and the program ends.
