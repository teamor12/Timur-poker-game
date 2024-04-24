import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        distributeCards(scanner);
    }
    public static void distributeCards(Scanner scanner){
        Deck deck =new Deck();
        deck.doStack();
        deck.shuffle();

        System.out.println("Enter person name");
        String name= scanner.next();
        Person person=new Person(name);
        person.addCard(deck.getCard());
        person.addCard(deck.getCard());

        System.out.println("");
        System.out.println("Enter opponent's name");
        String name2=scanner.next();
        Person person1=new Person(name2);
        person1.addCard(deck.getCard());
        person1.addCard(deck.getCard());

        System.out.println("");
        Person comunityCards=new Person("Comunity cards");
        comunityCards.addCard(deck.getCard());
        comunityCards.addCard(deck.getCard());
        comunityCards.addCard(deck.getCard());
        comunityCards.addCard(deck.getCard());
        comunityCards.addCard(deck.getCard());
    }
}
