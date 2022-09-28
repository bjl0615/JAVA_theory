package Card;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();

    public Deck deal(int count) {
        Deck hand = new Deck();

        int size = cards.size();
        for(int i = size - 1; i >= size - count; i--) {
            hand.addCard(cards.remove(i));
        }
        return hand;
    }
    /*
        새로운 Deck 인스턴스를 만들고 채워 넣어서 리턴해주는 deal메소드를 쓰면 된다.

        먼저 Deck 인스턴스를 만들고, count만큼 cards 리스트에서 빼서 새로운 Deck 인스턴스에 추가하고, 그 인스턴스를 리턴해주면 된다.
        생걱 해볼 점은, hand.addCard(cards.remove(i)); 이 부분인데, cards.remove(i)는 cards에서 i번 인덱스의 카드를 제거하는 것과 동시에 그 원소를 리턴해준다.

        cards.remove(i)는 cards에서 i번 인덱스의 카드를 제거하는 것과 동시에 그 원소를 리턴해준다. 이렇게 하면 cards의 뒤에서
        count번째 카드들을 쭉 뺄 수 있다.
     */

    public ArrayList<Card> getCards() {
        return cards;
    }
    /*
        일반적인 게터(getter)메소드
     */

    public void addCard(Card card) {
        cards.add(card);
    }
    /*
        cards는 private 변수이기 때문에 public 메소드인 addCard를 통해서 카드를 추가해준다.
     */

    public void print() {
        for(Card card : cards) {
            System.out.println(card.toString());
        }
    }
    /*
        cards리스크에 있는 건 각 Card 인스턴스를 예쁘게 출력하면 되는데 'for each'문과 toString 메소드를 사용하면 쉽게 해결할 수 있다.
     */

    public void shuffle() {
        Random random = new Random();

        for(int i = 0 ; i < cards.size(); i++) {
            int randIndex = random.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(randIndex));
            cards.set(randIndex, temp);
        }
    }
    /*
        52장의 카드가 있다고 가정 할 때 셔플의 방법은
            1. 0번의 카드를 0 ~ 51(총 52장, 51이 마지막 인덱스)번 카드 중 하나와 자리 바꿈
            2. 1번 카드를 0~51번 카드 중 하나와 자리 바꿈
            3. 2번 카드를 0~51번 카드 중 하나와 자리 바꿈
        이런 식으로 렌덤하게 섞인다.

        일단 0번부터 51번 까지 각 자리의 카드를 랜덤한 카드와 교한해야 하기 때문에 for문을 적어주어야 한다.

        그리고 그 안 에서 랜덤한 수를 생성해야 하는데, '숫자 도구'는 Random 클래스를 import해서 사용하면 된다.

        Random 인슼턴스는 한 번만 만들면 된다,

        번복문에 들어갈 때마다 0과 cards.size()(총 카드 개수)사이의 랜덤한 인덱스를 정해주면 된다.
        예를 들어서 스탠다드 카드 덱의 경우에 cards.size()는 52의 0 ~ 51 사이의 수가 만들어지는 것이다.

        i 인덱스의 카드와 랜덤하게 생성된 randIndex의 카드의 자리를 교환해주면 된다.
     */
}
