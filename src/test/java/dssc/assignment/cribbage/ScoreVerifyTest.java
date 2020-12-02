package dssc.assignment.cribbage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreVerifyTest {
    @Test
    void completeFlush() {
        Hand hand = new Hand("5H6H4HJH6H");
        assertEquals(6, hand.getScore());
    }

    @Test
    void completePairs() {
        Hand hand = new Hand("7S7D7H7C6H");
        assertEquals(12, hand.getScore());
    }

    @Test
    void completeRuns() {
        Hand hand = new Hand("5H6D7S8S9D");
        assertEquals(5, hand.getScore());
    }
}
