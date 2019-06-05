package test1;

public class MainCard {
    public static void main(String[] args) {

//        int num = 0;
//        for (Rank rank : Rank.values()) {
//            for (Suit suit : Suit.values()) {
//                num++;
//                System.out.println("The Card " + num + ": "
//                + rank.name() + "_" + suit.name());
//            }
//        }

        Card[] cards = new Card[52];
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                for (int i = 0; i < 1; i++) {
                    cards[i] = new Card(suit, rank);
                    System.out.println(cards[i]);
                }
            }
        }
    }
}
