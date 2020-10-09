public class Card {
    public Suit suit;
    public Face face;
    public int value;

    public Card(Suit suit, Face face, int value) {
        this.suit = suit;
        this.face = face;
        this.value = value;
    }

    public String toString() {
        return face.toString() + " of " + suit.toString();
    }
}
