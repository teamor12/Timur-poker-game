import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Person {
    private String name;
    public List<Card> personCards=new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCard(Card cards){
        personCards.add(cards);
    }
    public void printPersonCards(){
        System.out.println(name+" got ");
        for (Card card : personCards) {
            System.out.println(card);
        }
        System.out.println("");
    }

    public List<Card> getPersonCards() {
        return personCards;
    }
    public Optional<Card> biggestCard() {
        Optional<Card> card = personCards.stream()
                .max(Comparator.comparing(x -> x.getCardIndex()));
        return card;
    }

}
