package dssc.assignment.cribbage;

public class Card {
    String card;

    public Card(String card) {
        this.card = card;
    }

    public Rank rank() {
        switch (card.toUpperCase().charAt(0)) {
            case 'A':
                return Rank.ACE;
            case '2':
                return Rank.TWO;
            case '3':
                return Rank.THREE;
            case '4':
                return Rank.FOUR;
            case '5':
                return Rank.FIVE;
            case '6':
                return Rank.SIX;
            case '7':
                return Rank.SEVEN;
            case '8':
                return Rank.EIGHT;
            case '9':
                return Rank.NINE;
            case 'T':
                return Rank.TEN;
            case 'J':
                return Rank.JACK;
            case 'Q':
                return Rank.QUEEN;
            case 'K':
                return Rank.KING;
            default:
                return null;
        }
    }

    public Suite suite() {
        switch (card.toUpperCase().charAt(1)) {
            case 'H':
                return Suite.HEART;
            case 'D':
                return Suite.DIAMONDS;
            case 'C':
                return Suite.CLUBS;
            case 'S':
                return Suite.SPADES;
            default:
                return null;
        }
    }
}
