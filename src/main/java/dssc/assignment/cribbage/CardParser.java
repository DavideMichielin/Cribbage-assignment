package dssc.assignment.cribbage;

public class CardParser {
    public static Card parseCard(String cardAsText) {
        return new Card(cardAsText);
    }

    public static Card[] parseFourCard(){
        Card[] deck = new Card[4];
        for(int i = 0; i < 5; i++){
            parseOneCard();
        }
        return deck;
    }

    private static void parseOneCard() {

    }
}
