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
        Hand hand = new Hand("7S7D6H6C6H");
        assertEquals(6, hand.getScore());
    }

    @Test
    void completeRuns() {
        Hand hand = new Hand("5H6D7S8S9D");
        assertEquals(5, hand.getScore());
    }
    @Test
    void completeFifteen_Twos(){
        Hand hand = new Hand("AH2D3S9HAD");
        assertEquals(2, hand.getScore());
    }

    @Test
    void completeTest() {
        Hand hand = new Hand("5H5D5SJC5C");
        assertEquals(29, hand.getScore());
        //Hand hand1 = new Hand("0DJHQSAC9D");
        //assertEquals(4,hand1.getScore());
    }
}
