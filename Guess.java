import java.util.*; //Demo commit

class Guess {
    public static void main(String[] args) {
        Random rand = new Random();
        int max = 10, min = 1; // Limiters for RPS choosing
        int cpu_num = rand.nextInt((max - min) + 1) + min; // Pre-generate CPU's hand.
        int player_num;

        // Prompt
        System.out.println("I'm thinking of a number between 1 to 10!");
        System.out.println("Try to guess it!: ");

        // Create Scanner object
        Scanner s = new Scanner(System.in);
        player_num = s.nextInt();

        // Close out the Scanner since we don't want memory leaks happening.
        s.close();

        // Announce results
        System.out.println("You gu33essed: " + player_num);
        System.out.println("My number was: " + cpu_num);

        if (player_num == cpu_num) {
            System.out.println("You got it!");
        } else {
            System.out.println("Ooooh... Sorry!");
        }
    }
}