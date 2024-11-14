import java.util.*;

class MainRPS {
    public static void main(String[] args) {
        Random rand = new Random();
        int max = 3, min = 1; // Limiters for RPS choosing
        int cpu_hand = rand.nextInt((max - min) + 1) + min; // Pre-generate CPU's hand.
        int player_hand; // Initiate Player's hand

        // Prompt
        System.out.println("Time to play Rock, Paper Scissors!");
        System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors!");
        System.out.println("What hand ya playin?: ");

        // Create Scanner object
        Scanner s = new Scanner(System.in);

        // Set player's input into a value.
        player_hand = s.nextInt();

        s.close(); // Can't have memory leaks happening.

        // Flavour text
        System.out.println("Alright then!");
        System.out.println("Rock!");
        System.out.println("Paper!");
        System.out.println("Scissors!");

        // Shows the Player's hand
        if (player_hand == 1) {
            System.out.println("You played Rock!");
        } else if (player_hand == 2) {
            System.out.println("You played Paper!");
        } else if (player_hand == 3) {
            System.out.println("You played Scissors!");
        } else {
            System.out.println("You tried to cheat!"); // For those who try to input anything other than 1, 2 or 3.
        }

        // Shows the CPU's hand
        if (cpu_hand == 1) {
            System.out.println("And I play Rock!");
        } else if (cpu_hand == 2) {
            System.out.println("And I play Paper!");
        } else if (cpu_hand == 3) {
            System.out.println("And I play Scissors!");
        }

        // Announce results
        if (player_hand == 1 && cpu_hand == 1) {
            System.out.println("So it's a draw!");
        } else if (player_hand == 1 && cpu_hand == 2) {
            System.out.println("I win!");
        } else if (player_hand == 1 && cpu_hand == 3) {
            System.out.println("You win!");
        } else if (player_hand == 2 && cpu_hand == 1) {
            System.out.println("You win!");
        } else if (player_hand == 2 && cpu_hand == 2) {
            System.out.println("So it's a draw!");
        } else if (player_hand == 2 && cpu_hand == 3) {
            System.out.println("I win!");
        } else if (player_hand == 3 && cpu_hand == 1) {
            System.out.println("I win!");
        } else if (player_hand == 3 && cpu_hand == 2) {
            System.out.println("You win!");
        } else if (player_hand == 3 && cpu_hand == 3) {
            System.out.println("So it's a draw!");
        } else {
            System.out.println("Since you tried to cheat, it's my victory!");
        }
    }
}