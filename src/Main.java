import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("Select action to continue");
            System.out.println();
            System.out.println("play or break ");
            String action=scanner.next();
            switch (action){
                case "play"->multiplePlay(scanner);
                case "break" -> {
                    return;
                }
                default -> System.out.println("Error ,try again");
            }
            if(Objects.equals("break",action)){
                break;
            }
        }
    }
    public static void multiplePlay(Scanner scanner){
        Deck deck =new Deck();
        deck.doStack();
        deck.shuffle();

        System.out.println("How many player's will be playing ?");
        int playerNum= scanner.nextInt();
        if(playerNum>1&&playerNum<11) {
            List<Person> people = new ArrayList<>();

            for (int i = 0; i < playerNum; i++) {
                System.out.println("Enter person name");
                String name = scanner.next();
                Person person = new Person(name);
                for (int j = 0; j < 2; j++) {
                    person.addCard(deck.getCard());
                }
                person.printPersonCards();
                people.add(person);
                System.out.println("");
            }
            System.out.println("");
            Person communityCards = new Person("Comunity cards");
            communityCards.addCard(deck.getCard());
            communityCards.addCard(deck.getCard());
            communityCards.addCard(deck.getCard());
            communityCards.addCard(deck.getCard());
            communityCards.addCard(deck.getCard());
            communityCards.printPersonCards();

            MultipleWinner multipleWinner = new MultipleWinner(people, communityCards.getPersonCards());
            multipleWinner.winnerFinder();
        } else if(playerNum>=11){
            System.out.println("Too much players can not play poker");
            System.out.println("Select less player number");
        } else {
            System.out.println("You should have at least 2 people to play");
        }
    }

}
