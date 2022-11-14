import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Choose the amounts of sticks that you want to play with.");
        int initialSticks = scanner.nextInt();
        int player1 = 0;
        int player2 = 0;
        int current1 = 0;
        int current2 = 0;

        while(initialSticks > 0){
            if(initialSticks == 0){
               break;
            }

            System.out.println("Player 1: Pick a stick between 1 - 3. Remaining Sticks Left: " + initialSticks);
            player1 = scanner.nextInt();

            while(player1 > 3 || player1 < 0){
                System.out.println("Invalid Input. Pick a stick between 1 - 3. Remaining Sticks Left: " + initialSticks);
                player1 = scanner.nextInt();
            }
        
            initialSticks -= player1;
            player1 = 0;
            current1++;

            System.out.println("Player 2: Pick a stick between 1 - 3. Remaining Sticks Left: " + initialSticks);
            player2 = scanner.nextInt();

            while(player2 > 3 || player2 < 0){
                System.out.println("Invalid Input. Pick a stick between 1 - 3. Remaining Sticks Left: " + initialSticks);
                player2 = scanner.nextInt();
            }

            initialSticks -= player2;
            player2 = 0;
            current2++;
            
            }
        
        if(current1 > current2){
            System.out.println("The Winner is Player 2");
        } else{
            System.out.println("The Winner is Player 1");
        }
        scanner.close();
    }
}