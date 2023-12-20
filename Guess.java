/*
TASK 1: NUMBER GAME
1. Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number.
You can incorporate additional details as follows:
5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.
*/

package task_1;
import java.util.*;


public class Guess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        int rounds = 0;

        do {
            int num = (int) (Math.random() * 100 + 1);
            int attempts = 0;
            rounds++;

            System.out.print("Enter the Number: ");
            int guess = s.nextInt();

            do {
                if (guess == num) {
                    System.out.println("Congratulations!!! Your guess is absolutely correct");
                    System.out.println("Number of attempts: " + attempts);
                    total += attempts;
                    break;
                } else if (guess > num) {
                    System.out.println("Ooops!!! Your guess is greater than the number");
                } else {
                    System.out.println("Ooops!!! Your guess is smaller than the number");
                }

                System.out.print("Enter number again: ");
                guess = s.nextInt();
                attempts++;

                if (attempts >= 5) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. \nThe correct number was: " + num);
                    break;
                }

            } while (true);

            System.out.print("Do you want to play again? (yes/no): ");
            String play = s.next();

           if (!play.equalsIgnoreCase("yes")) {
                break;
            }

        } while (true);

        System.out.println("Game Over");
        System.out.println("Total Rounds: " + rounds);
        System.out.println("Total Score: " + total);
    }
}
