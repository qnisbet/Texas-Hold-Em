import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.shuffle;

public class Deck {
    private ArrayList<Suit> suits;
    private ArrayList<Face> faces;
    public ArrayList<Card> cards;
    public int size = 52;

    public Deck() {
        suits = new ArrayList<Suit>();
        suits.add(Suit.Spades);
        suits.add(Suit.Hearts);
        suits.add(Suit.Clubs);
        suits.add(Suit.Diamonds);

        faces = new ArrayList<Face>();
        faces.add(Face.Two);
        faces.add(Face.Three);
        faces.add(Face.Four);
        faces.add(Face.Five);
        faces.add(Face.Six);
        faces.add(Face.Seven);
        faces.add(Face.Eight);
        faces.add(Face.Nine);
        faces.add(Face.Ten);
        faces.add(Face.Jack);
        faces.add(Face.Queen);
        faces.add(Face.King);
        faces.add(Face.Ace);

        cards = new ArrayList<Card>();
        int counter = 2;
        for(Suit suit : suits) {
            for (Face face : faces) {
                cards.add(new Card(suit, face, counter));
                counter++;
            }
            counter = 2;
        }
    }

    public void oneLess() {
        size--;
    }
    public void shuffleDeck() {
        shuffle(cards);
    }

    public String toString() {
        String ret = "";
        for(Card card : cards) {
            System.out.println(card);
        }
        return ret;
    }
}
