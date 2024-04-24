public class Card {
    protected  CardType cardType;
    protected  String cardNum;

    public Card(CardType cardType, String cardNum) {
        this.cardType = cardType;
        this.cardNum = cardNum;
    }

    public  CardType getCardType() {
        return cardType;
    }

    public  String getCardNum() {
        return cardNum;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "cardType=" + cardType +
                ", cardNum='" + cardNum + '\'' +
                '}';
    }
}
