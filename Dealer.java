public class Dealer {
    private int players;
    Deck deck;

    public Dealer(int players) {
        this.players = players;
        deck = new Deck();
        deck.shuffleDeck();
    }
    public int getPlayers() {
        return players;
    }
    public void setPlayers(int players) {
        this.players = players;
    }

    public Card deal() {
        Card dealt = deck.cards.get((int)(Math.random() * deck.size));
        deck.cards.remove(dealt);
        deck.oneLess();
        return dealt;
    }
}
