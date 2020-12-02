package dssc.assignment.cribbage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ParseHandTest {

    @Test
    void parseOneCard() {
        Card card = CardParser.parseCard("5H");
        assertAll(
                () -> assertEquals('5', card.rank()),
                () -> assertEquals(Suite.HEART, card.suite())
        );
    }

    @Test
    void parseOneCardDiamonds() {
        Card card = CardParser.parseCard("5D");
        assertAll(
                () -> assertEquals('5', card.rank()),
                () -> assertEquals(Suite.DIAMONDS, card.suite())
        );
    }

    @Test
    void parseOneCardClubs() {
        Card card = CardParser.parseCard("5C");
        assertAll(
                () -> assertEquals('5', card.rank()),
                () -> assertEquals(Suite.CLUBS, card.suite())
        );
    }
}
