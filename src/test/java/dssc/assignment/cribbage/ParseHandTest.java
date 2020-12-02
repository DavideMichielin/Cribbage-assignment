package dssc.assignment.cribbage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ParseHandTest {
    @Test
    void parseOneCard() {
        Card card = CardParser.parseCard("5H");
        assertAll(
                () -> assertEquals(Rank.FIVE, card.rank()),
                () -> assertEquals(Suite.HEART, card.suite())
        );
    }

    @Test
    void parseOneCardDiamonds() {
        Card card = CardParser.parseCard("5D");
        assertAll(
                () -> assertEquals(Rank.FIVE, card.rank()),
                () -> assertEquals(Suite.DIAMONDS, card.suite())
        );
    }

    @Test
    void parseOneCardClubs() {
        Card card = CardParser.parseCard("5C");
        assertAll(
                () -> assertEquals(Rank.FIVE, card.rank()),
                () -> assertEquals(Suite.CLUBS, card.suite())
        );
    }
}
