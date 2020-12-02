package dssc.assignment.cribbage;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculateScore {
    private ArrayList<Card> hand;

    public CalculateScore(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public int getScore() {
        return flush() + pairs() + runs() + fif_twos();
    }

    private int flush() {
        int score = 0;
        boolean give_point = true;
        for (int i = 0; i < hand.size() - 2; i++) {
            if (hand.get(i).suite() != hand.get(i + 1).suite()) {
                give_point = false;
            }
        }
        if (give_point) score += 4;
        if (give_point && hand.get(0).suite() == hand.get(4).suite()) score++;
        give_point = false;
        for (int i = 0; i < hand.size() - 1; i++) {
            if (hand.get(i).rank() == 11 && hand.get(i).suite() == hand.get(4).suite()) {
                give_point = true;
            }
        }
        if (give_point) score += 1;
        return score;
    }

    private int pairs() {
        int count = 0;
        for (int i = 0; i < hand.size() - 1; i++) {
            if (hand.get(i).rank() == hand.get(i + 1).rank()) {
                count++;
            }
        }
        switch (count) {
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 12;
            default:
                return 0;
        }
    }

    private int runs() {
        int count = 1;
        int best = 0;
        int[] orderedHand = orderCard(hand);
        for (int i = 0; i < orderedHand.length - 1; i++) {
            if (orderedHand[i + 1] == orderedHand[i] + 1) {
                count++;
                if (count > best) best = count;
            } else {
                count = 1;
            }
        }
        switch (best) {
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                return 0;
        }
    }

    private int[] orderCard(ArrayList<Card> hand) {
        int[] ordered = new int[5];
        for (int i = 0; i < hand.size(); i++) {
            ordered[i] = hand.get(i).rank();
        }
        Arrays.sort(ordered);
        return ordered;
    }

    private int fif_twos() {
        return 0;
    }
}
