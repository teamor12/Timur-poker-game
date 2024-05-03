import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    public List<Card> personCards=new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }
    public void addCard(Card cards){
        personCards.add(cards);
    }
    public void printPersonCards(){
        System.out.println(name+" got ");
        for (Card card : personCards) {
            System.out.println(card);
        }
    }

    public List<Card> getPersonCards() {
        return personCards;
    }
}
