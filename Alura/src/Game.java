import java.util.Random;
import java.util.Scanner;

public class Game {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int generatedNumber = new Random().nextInt(100); // random number 0 to 100
            int attempts = 0;

            while (attempts < 5) {
                System.out.print("enter a number between 0 to 100: ");
                int typedNumber = leitor.nextInt();
                attempts++;

                if (typedNumber == generatedNumber) {
                    System.out.println("Congratulations you got it right" + attempts + " number of attempts!");
                    break; // pause loop while
                } else if (typedNumber < generatedNumber) {
                    System.out.println("O entered number less than generated");
                } else {
                    System.out.println("O number entered greater than the generated.");
                }
            }

            if (attempts == 5) {
                System.out.println("You can't get right after 5 tries. O the number was " + generatedNumber);
            }
        }
    }

