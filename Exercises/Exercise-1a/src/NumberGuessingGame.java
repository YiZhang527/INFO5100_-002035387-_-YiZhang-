import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to guessing number game!");
        Scanner userInput = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Start Game");
            System.out.println("2. Exit");
            System.out.println("Please enter your choice:");

            choice = userInput.nextInt();
            switch (choice) {
                case 1:
                    startGame(userInput);
                    break;
                case 2:
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Wrong Choice! Please enter 1 or 2.");
            }
            ;
        } while (choice != 2);
        userInput.close();
    }

    public static void startGame(Scanner userInput) {
        Random rand = new Random();
        int answer = rand.nextInt(10) + 1;
        boolean gameOver = false;
        System.out.println("I have generated a number between 1 and 10. You have at most 5 attempts to guess it.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Please enter the number between 1-10 you want to guess:");
            int number = userInput.nextInt();
            if (number == answer) {
                System.out.println("Correct!");
                gameOver = true;
                break;
            } else if (number > answer) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }
        if (!gameOver) {
            System.out.println("The correct number is " + answer + " !");
        }
    }
}
