package dssc.assignment.cribbage;

import java.util.ArrayList;

public class Hand {
    private final int MAX_SIZE_HAND = 10;
    private ArrayList<Card> hand;

    public Hand(String handDeck) {
        if (handDeck.length() != MAX_SIZE_HAND) {
            System.out.println("Hand size is not valid");
            System.exit(2);
        } else {
            hand = new ArrayList<>();
            for (int i = 0; i < MAX_SIZE_HAND; i += 2) {
                String card = "" + handDeck.charAt(i) + handDeck.charAt(i + 1);
                hand.add(CardParser.parseCard(card));
            }
        }
    }

    public Card getCard(int i) {
        if (i > 4 && i < 0) {
            return null;
        }
        return hand.get(i - 1);
    }

    ;

    public int getScore() {
        CalculateScore score = new CalculateScore(hand);
        return score.getScore();
    }

}
