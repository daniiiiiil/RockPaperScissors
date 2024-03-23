import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLAYER 1: Select 1 - Rock, 2 - Paper, 3 - Scissors");
        int PlayerOne = scan.nextInt();
        System.out.println("PLAYER 2: Select 1 - Rock, 2 - Paper, 3 - Scissors");
        int PlayerTwo = scan.nextInt();
        if (PlayerOne == PlayerTwo){
            System.out.println("TIE");
        }else if (PlayerOne == 1){
            if (PlayerTwo == 2){
                System.out.println("Player 2 - WIN");
            }else {
                System.out.println("Player 1 - WIN");
            }
        } else if (PlayerOne == 2) {
            if (PlayerTwo == 1){
                System.out.println("Player 1 - WIN");
            }else {
                System.out.println("Player 2 - WIN");
            }
        } else if (PlayerOne == 3) {
            if (PlayerTwo == 1){
                System.out.println("Player 2 - WIN");
            }else {
                System.out.println("Player 1 - WIN");
            }
        }else {
            System.out.println("ERROR!!!");
        }

    }
}
