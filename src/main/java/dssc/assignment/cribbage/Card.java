package dssc.assignment.cribbage;

public class Card {
    String card;

    public Card(String card) {
        this.card = card;
    }

    public char rank() {
        return card.charAt(0);
    }

    public Suite suite() {
        switch(card.toUpperCase().charAt(1)){
            case 'H':
                return Suite.HEART;
            case 'D':
                return Suite.DIAMONDS;
            case 'C':
                return Suite.CLUBS;
            default:
                return null;
        }
    }
}
