package dssc.assignment.cribbage;

public class Card {
    private Rank rank;
    private Suite suite;

    public Card(String card) {
        rank = getRank(card.charAt(0));
        suite = getSuite(card.charAt(1));
    }

    public Rank getRank(char numberChar) {
        switch (Character.toUpperCase(numberChar)) {
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
            case '0':
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

    public Suite getSuite(char charSuite) {
        switch (Character.toUpperCase(charSuite)) {
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
    public Suite suite(){
        return suite;
    }
    public int rank(){
        return rank.getRank();
    }
    public void setRank(int rank){

    }
}
