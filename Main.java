import game.MagicalArena; 
import game.Player;       
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;  //boolean variable to play again.

         //Welcome Message
        System.out.println(" ");
        System.out.println("      /| ________________                                     ________________|\\");
        System.out.println("O|===|* >________________>>>   welcome to magical arena    <<<________________ *<|===|0");
        System.out.println("      \\|                                                                      |/");
        //Prompt to Play Again
        while (playAgain) { 
            playGame(scanner);

            System.out.print("Do you want to play again? (Yes-Y/No-N): ");
            String choice = scanner.nextLine().toUpperCase();

            while (!choice.equals("Y") && !choice.equals("N")) {
                System.out.print("Invalid choice. Please enter Yes-Y or No-N: ");
                choice = scanner.nextLine().toUpperCase();
            }

            if (choice.equals("N")) {
                playAgain = false;
            }
        }

        scanner.close();
    }
     //User Input for Player Attributes such as health,attack,strength 
    private static void playGame(Scanner scanner) {
        int healthA = promptPositiveInt(scanner, "Enter positive integer health for Player A:  ");
        int strengthA = promptPositiveInt(scanner, "Enter positive integer strength for Player A: ");
        int attackA = promptPositiveInt(scanner, "Enter positive integer attack for Player A: ");

        int healthB = promptPositiveInt(scanner, "Enter positive integer health for Player B: ");
        int strengthB = promptPositiveInt(scanner, "Enter positive integer strength for Player B: ");
        int attackB = promptPositiveInt(scanner, "Enter positive integer attack for Player B: ");

        Player playerA = new Player(healthA, strengthA, attackA);
        Player playerB = new Player(healthB, strengthB, attackB);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.fight();
    }
    //Error Handling for Wrong Input by User returning messsage to correct it, as value can't be negative or symbol.
    private static int promptPositiveInt(Scanner scanner, String message) {
        int input;
        while (true) {
            System.out.print(message);
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input <= 0) {
                    System.out.println("Error: Please enter a positive integer greater than zero.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid integer.");
            }
        }
        return input;
    }
}
