package Blackjack_2;


import Blackjack_2.Card;

public class BlackjackCard extends Card {
    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

    public int getValue() {
        // rank를 가준
        // Ace(1)은 11을 리턴
        // J, Q, K(11-13)은 10을 리턴

        switch(rankNumber) {
            case 1 :
                return 11;
            case 11 :
            case 12 :
            case 13 :
                return 10;
            default:
                return rankNumber;
        }
    }

    public boolean isAce() {
        return rankNumber == 1;
    }
}
