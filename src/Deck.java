import java.util.Collections;
import java.util.List;
import java.util.Stack;
public class Deck {
    public Deck() {
    }

    public Stack<Card> cardsStack=new Stack<>();
    public void doStack(){
       CardType[] values = CardType.values();
       List<String> numbers=List.of("2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace");
        for (String number : numbers) {
            for (CardType value : values) {
                cardsStack.push(new Card(value,number, numbers.indexOf(number)+2));
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(cardsStack);
    }
    public Card getCard(){
       return cardsStack.pop();
    }
    public int cardSize(){
        return cardsStack.size();
    }
}
