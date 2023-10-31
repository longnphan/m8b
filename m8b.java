import java.util.Scanner;
import java.util.Random;

public class Magic8ball {
    // Declare Scanner object outside of main so other methods can use it
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        start();
    }

    private static void start() {
        // Prompts user to type in a yes/no question
        System.out.println("Please type in a yes/no question: ");

        // Stores user input into userQuestion variable
        String userQuestion = scanner.nextLine();

        // If user input is empty, start method will run again
        if (userQuestion.isEmpty()) {
            start();
        } else {
            // shake8Ball method will run when user enters in non-empty input
            shake8Ball();
        }
    }

    private static void shake8Ball() {
        // Create instance of Random class
        Random rand = new Random();

        // Twenty different Magic 8-ball outcome responses
        String[] outcome = {
                "It is decidedly so", "Most likely", "Ask again later",
                "My reply is no", "It is certain", "As I see it, yes",
                "Reply hazy, try again", "Don't count on it",
                "Without a doubt", "Outlook good", "Better not tell you now",
                "My sources say no", "Yes definitely", "Yes",
                "Cannot predict now", "Outlook not so good",
                "You may rely on it", "Signs point to yes",
                "Concentrate and ask again", "Very doubtful"
        };

        // Generate random int from 0 to 19
        int randomNum = rand.nextInt(20);

        // Print out random Magic 8-ball outcome
        System.out.println("\nThe Magic 8-Ball says: " + outcome[randomNum]);

        // Prompts user if they want to shake the Magic 8-ball or quit
        System.out.println("\nPress Q or q to quit. Press any other key + return to shake the Magic 8-Ball again.");

        // Stores user input into ShakeAgainInput variable
        String shakeAgainInput = scanner.next();

        // Checks user input to determine if user wants to quit or shake again
        if (shakeAgainInput.equalsIgnoreCase("q")) {
            System.out.println("Thanks for trying out my Magic 8-Ball program!");
        } else {
            // Runs the shake8Ball method again
            System.out.println("\n*** Shaking Magic 8-Ball ***");
            shake8Ball();
        }
    }
}
