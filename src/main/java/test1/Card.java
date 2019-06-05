package test1;

public class Card {
    private Suit cardSuite;
    private Rank cardRank;

    Card(Suit cardSuite, Rank cardRank) {
        this.cardSuite = cardSuite;
        this.cardRank = cardRank;
    }


    @Override
    public String toString() {
        return "The Card: " + cardRank + "_" + cardSuite;
    }
}
