import java.util.ArrayList;
public class Player {
    final int handSize = 2;
    private ArrayList<Card> hand;
    public String name;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<Card>(handSize);
    }
    public void giveCard(Card card) {
        hand.add(card);
    }
    public void showHand() {
        System.out.println(hand.get(0).toString() + " and " + hand.get(1).toString());
    }
    public String toString() {
        return name;
    }
}
