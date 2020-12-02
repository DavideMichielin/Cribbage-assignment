package dssc.assignment.cribbage;

public enum Rank {

    ACE(1, "A"), TWO(2, "2"), THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"),
    SIX(6, "6"), SEVEN(7, "7"), EIGHT(8, "8"), NINE(9, "9"), TEN(10, "0"),
    JACK(11, "J"), QUEEN(12, "Q"), KING(13, "K");

    private final String value;
    private final int rank;

    Rank(int rank, String value) {
        this.rank = rank;
        this.value = value;
    }

    public int getRank() {
        return rank;
    }

    public String getValue() {
        return value;
    }


}
