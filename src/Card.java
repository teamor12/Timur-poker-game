public class Card {
    protected  CardType cardType;
    protected  String cardNum;
    private int index;

    public Card(CardType cardType, String cardNum,int index) {
        this.cardType = cardType;
        this.cardNum = cardNum;
        this.index=index;
    }

    public  CardType getCardType() {
        return cardType;
    }

    public  String getCardNum() {
        return cardNum;
    }
    public int getCardIndex(){return index;}

    @Override
    public String toString() {
        return "Cards{" +
                "cardType=" + cardType +
                ", cardNum='" + cardNum + '\'' +
                '}';
    }
}
