package Blackjack_2;

/*
    캐스팅
        Deck 클래스에서 선언된 ArrayList는 Card 인스턴스를 담는 ArrayList이다.

        Card 클래스를 상속한 BlackjackCard 인스턴스도 cards에 넣을 수 있다. 하지만 cards에서 BlackjackCard 인스턴스를 꺼내서 쓸 때에는 캐스팅이 꼭 필요하다.

    public int getValue();
        블랙잭의 룰에 맞게 핸드의 가치를 리턴하는 메소드를 구현

    public boolean isBusted()
        핸드의 가치가 21을 넘으면 '파산(Busted)'이다. 현재 핸드가 파산했는지 리턴해주는 메소드

    public boolean isBlackjack()
        핸드가 두 장의 카드만 가지고 있고 가치가 21이면 '블랙잭'이다. 현제 핸드가 블랙잭인지 리턴해주는 메소드
 */

public class BlackjackHand extends Deck{

    @Override
    public void addCard(Card card) {
        super.addCard(card);
    }

    public int getValue() {
        int value = 0;
        int aceCount = 0;

        // Ace
        // value가 21을 넘었을 경우 Ace는 1의 값을 가짐

        // Ace x2, J , 6
        // 11 + 11 + 10 + 6 = 38
        // 1 + 1 + 10 + 6 = 18

        // Ace가 몇장? 현재 value?

        for(Card c : getCards()) {
            BlackjackCard card = (BlackjackCard) c;

            if(card.isAce()) {
                aceCount++;
            }

            value += card.getValue();
        }

        while(aceCount > 0 && value > 21){
            value -= 10;
            aceCount--;
        }

        return value;
    }

    public boolean isBusted() {
        return getValue() > 21;
    }

    public boolean isBlackjack() {
        return getValue() == 21 && getCards().size() == 2;
    }


}
