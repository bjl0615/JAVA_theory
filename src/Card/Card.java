package Card;

public class Card {
    int suitNumber;
    int rankNumber;
    public Card(int suitNumber, int rankNumber){
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }

    public String getSuit() {
        switch (suitNumber) {
            case 1 :
                return "Clubs";
            case 2 :
                return "Diamonds";
            case 3 :
                return "Hearts";
            case 4 :
                return "Spades";
            default :
                return "";
        }
    }
    /*
        각 case에서 return을 바로 시키기 때문에(return을 만나면 메소드가 바로 종료되기 때문에) 따로 break;를 적어주지 않아도 된다.

        하지만 이렇게 할 경우, default를 적지 않으면 메소드가 return 없이 종료되는 문제가 생기기 때문에 반드시 default에서도 return을 시켜주어야 문법적으로 온전한 메소드가 된다.
     */

    /*
        마찬가지로 rankNumber애 담긴 값애 따라 Rank애 해당하는 문자열을 만들어 내는 getRank 메소드 이다.
     */
    public String getRank() {
        switch(rankNumber) {
            case 1 :
                return "Ace";
            case 11 :
                return "Jack";
            case 12 :
                return "Queen";
            case 13 :
                return "King";
            default :
                return String.valueOf(rankNumber);
        }
    }

    /*
        getSuit와 거의 흡사하다. 1, 11~13은 각각 특별한 처리가 필요하고 2 ~ 10까지는 rankNumber에 해당하는 값을 문자열에 담아서 리턴해주기만 하면 되니,
        String.valueOf(rankNumber)를 사용할 수 있다.

        String.valueOf(rankNumber)을 표현하는 방법은 다양하다.
        Integer.toString(rankNumber)를 사용할 수도 있고, 연산의 형 변환을 이용하여 rankNumber+""등도 가능하다

        마지막 방법(rankNumber + "")은 디버깅용으로 급히 값을 출력할 때 말고는 별로 권장하지 않는다.
     */

    @Override
    public String toString() {
        return getRank() + "of" + getSuit();
    }
}
