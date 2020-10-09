import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static ArrayList<Player> players;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("*********  Texas Hold'em Poker  *********");
        System.out.println("How many players will be playing tonight?");
        Dealer dealer = new Dealer(scan.nextInt());
        players = new ArrayList<Player>(dealer.getPlayers());
        for(int i = 1; i <= dealer.getPlayers(); i++) {
            players.add(new Player("Player " + i));
        }
        System.out.println();
        System.out.println("We now have " + dealer.getPlayers() + " players in the game. Let's begin.");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        for(Player player : players) {
            player.giveCard(dealer.deal());
            player.giveCard(dealer.deal());
        }
        for(Player player : players) {
            System.out.print(player.toString() + " has ");
            player.showHand();
        }
        System.out.println();
        System.out.println(dealer.deck.size);
    }
}
