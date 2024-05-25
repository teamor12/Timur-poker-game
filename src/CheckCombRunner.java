import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckCombRunner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("");
            System.out.println("Select integer of Combination to check");
            System.out.println("Options:");
            System.out.println("1:royal flash and pair");
            System.out.println("2:four of kind");
            System.out.println("3:full house");
            System.out.println("4:flash and straight");
            System.out.println("5:three of kind and two of kind");
            System.out.println("6:similar combination test");
            System.out.println("7:break ");
            int action = scanner.nextInt();
            switch (action){
                case 1->royalFlashAndTwoPair();
                case 2->fourofKind();
                case 3->fullHouse();
                case 4->flushAndStraight();
                case 5->threeOfKindAndTwoKind();
                case 6->similarTest();
                case 7 -> {
                    return;
                }
            }
        }
    }
    public static void royalFlashAndTwoPair(){
        List<Card> allPerson1= new ArrayList<>();
        List<Card> allPerson2=new ArrayList<>();
        String name="person1";
        String name2="person2";
        Person person1=new Person(name);
        person1.addCard(new Card(CardType.Club,"2",2));
        person1.addCard(new Card(CardType.Club,"3",3));
        person1.printPersonCards();

        Person person2=new Person(name2);
        person2.addCard(new Card(CardType.Heart,"5",5));
        person2.addCard(new Card(CardType.Diamonds,"7",7));
        person2.printPersonCards();

        Person communityCards=new Person("Community cards");
        communityCards.addCard(new Card(CardType.Club,"4",4));
        communityCards.addCard(new Card(CardType.Club,"5",5));
        communityCards.addCard(new Card(CardType.Club,"6",6));
        communityCards.addCard(new Card(CardType.Diamonds,"4",4));
        communityCards.addCard(new Card(CardType.Spades,"7",7));
        communityCards.printPersonCards();

        for (int i = 0; i < person1.getPersonCards().size(); i++) {
            allPerson1.add(person1.getPersonCards().get(i));
            allPerson2.add(person2.getPersonCards().get(i));
        }
        for (int i = 0; i < communityCards.getPersonCards().size(); i++) {
            allPerson1.add(communityCards.getPersonCards().get(i));
            allPerson2.add(communityCards.getPersonCards().get(i));
        }
        HandResolver result1=new HandResolver(allPerson1);
        HandResolver result2=new HandResolver(allPerson2);

        System.out.println("First person's combination");
        result1.printComb();

        System.out.println("Second person's combination");
        result2.printComb();

    }
    public static void fourofKind(){
        List<Card> allPerson1= new ArrayList<>();
        List<Card> allPerson2=new ArrayList<>();

        String name="person1";
        String name2="person2";
        Person person1=new Person(name);
        person1.addCard(new Card(CardType.Club,"2",2));
        person1.addCard(new Card(CardType.Heart,"2",2));
        person1.printPersonCards();

        Person person2=new Person(name2);
        person2.addCard(new Card(CardType.Heart,"5",5));
        person2.addCard(new Card(CardType.Diamonds,"7",7));
        person2.printPersonCards();

        Person communityCards=new Person("Community cards");
        communityCards.addCard(new Card(CardType.Diamonds,"2",2));
        communityCards.addCard(new Card(CardType.Spades,"2",2));
        communityCards.addCard(new Card(CardType.Club,"6",6));
        communityCards.addCard(new Card(CardType.Diamonds,"4",4));
        communityCards.addCard(new Card(CardType.Spades,"7",7));
        communityCards.printPersonCards();

        for (int i = 0; i < person1.getPersonCards().size(); i++) {
            allPerson1.add(person1.getPersonCards().get(i));
            allPerson2.add(person2.getPersonCards().get(i));
        }
        for (int i = 0; i < communityCards.getPersonCards().size(); i++) {
            allPerson1.add(communityCards.getPersonCards().get(i));
            allPerson2.add(communityCards.getPersonCards().get(i));
        }
        HandResolver result1=new HandResolver(allPerson1);
        HandResolver result2=new HandResolver(allPerson2);

        System.out.println("First person's combination");
        result1.printComb();

        System.out.println("Second person's combination");
        result2.printComb();
    }
    public static void fullHouse(){
        List<Card> allPerson1= new ArrayList<>();
        List<Card> allPerson2=new ArrayList<>();

        String name="person1";
        String name2="person2";
        Person person1=new Person(name);
        person1.addCard(new Card(CardType.Club,"2",2));
        person1.addCard(new Card(CardType.Heart,"2",2));
        person1.printPersonCards();

        Person person2=new Person(name2);
        person2.addCard(new Card(CardType.Heart,"5",5));
        person2.addCard(new Card(CardType.Diamonds,"7",7));
        person2.printPersonCards();


        Person communityCards=new Person("Community cards");
        communityCards.addCard(new Card(CardType.Diamonds,"2",2));
        communityCards.addCard(new Card(CardType.Spades,"3",3));
        communityCards.addCard(new Card(CardType.Club,"3",3));
        communityCards.addCard(new Card(CardType.Diamonds,"4",4));
        communityCards.addCard(new Card(CardType.Spades,"7",7));
        communityCards.printPersonCards();

        for (int i = 0; i < person1.getPersonCards().size(); i++) {
            allPerson1.add(person1.getPersonCards().get(i));
            allPerson2.add(person2.getPersonCards().get(i));
        }
        for (int i = 0; i < communityCards.getPersonCards().size(); i++) {
            allPerson1.add(communityCards.getPersonCards().get(i));
            allPerson2.add(communityCards.getPersonCards().get(i));
        }
        HandResolver result1=new HandResolver(allPerson1);
        HandResolver result2=new HandResolver(allPerson2);

        System.out.println("First person's combination");
        result1.printComb();

        System.out.println("Second person's combination");
        result2.printComb();
    }
    public static void flushAndStraight(){
        List<Card> allPerson1= new ArrayList<>();
        List<Card> allPerson2=new ArrayList<>();

        String name="person1";
        String name2="person2";
        Person person1=new Person(name);
        person1.addCard(new Card(CardType.Club,"2",2));
        person1.addCard(new Card(CardType.Heart,"2",2));
        person1.printPersonCards();

        Person person2=new Person(name2);
        person2.addCard(new Card(CardType.Heart,"5",5));
        person2.addCard(new Card(CardType.Diamonds,"7",7));
        person2.printPersonCards();

        Person communityCards=new Person("Community cards");
        communityCards.addCard(new Card(CardType.Club,"4",4));
        communityCards.addCard(new Card(CardType.Club,"3",3));
        communityCards.addCard(new Card(CardType.Club,"6",6));
        communityCards.addCard(new Card(CardType.Spades,"4",4));
        communityCards.addCard(new Card(CardType.Club,"7",7));
        communityCards.printPersonCards();

        for (int i = 0; i < person1.getPersonCards().size(); i++) {
            allPerson1.add(person1.getPersonCards().get(i));
            allPerson2.add(person2.getPersonCards().get(i));
        }
        for (int i = 0; i < communityCards.getPersonCards().size(); i++) {
            allPerson1.add(communityCards.getPersonCards().get(i));
            allPerson2.add(communityCards.getPersonCards().get(i));
        }
        HandResolver result1=new HandResolver(allPerson1);
        HandResolver result2=new HandResolver(allPerson2);

        System.out.println("First person's combination");
        result1.printComb();

        System.out.println("Second person's combination");
        result2.printComb();
    }
    public static void threeOfKindAndTwoKind(){
        List<Card> allPerson1= new ArrayList<>();
        List<Card> allPerson2=new ArrayList<>();

        String name="person1";
        String name2="person2";
        Person person1=new Person(name);
        person1.addCard(new Card(CardType.Club,"2",2));
        person1.addCard(new Card(CardType.Heart,"2",2));
        person1.printPersonCards();

        Person person2=new Person(name2);
        person2.addCard(new Card(CardType.Heart,"5",5));
        person2.addCard(new Card(CardType.Diamonds,"7",7));
        person2.printPersonCards();


        Person communityCards=new Person("Community cards");
        communityCards.addCard(new Card(CardType.Club,"9",9));
        communityCards.addCard(new Card(CardType.Spades,"2",2));
        communityCards.addCard(new Card(CardType.Diamonds,"6",6));
        communityCards.addCard(new Card(CardType.Spades,"4",4));
        communityCards.addCard(new Card(CardType.Club,"7",7));
        communityCards.printPersonCards();

        for (int i = 0; i < person1.getPersonCards().size(); i++) {
            allPerson1.add(person1.getPersonCards().get(i));
            allPerson2.add(person2.getPersonCards().get(i));
        }
        for (int i = 0; i < communityCards.getPersonCards().size(); i++) {
            allPerson1.add(communityCards.getPersonCards().get(i));
            allPerson2.add(communityCards.getPersonCards().get(i));
        }
        HandResolver result1=new HandResolver(allPerson1);
        HandResolver result2=new HandResolver(allPerson2);

        System.out.println("First person's combination");
        result1.printComb();

        System.out.println("Second person's combination");
        result2.printComb();
    }
    public static void similarTest(){
        List<Card> allPerson1= new ArrayList<>();
        List<Card> allPerson2=new ArrayList<>();
        List<Person> people=new ArrayList<>();

        String name="person1";
        String name2="person2";
        Person person1=new Person(name);
        person1.addCard(new Card(CardType.Club,"5",5));
        person1.addCard(new Card(CardType.Heart,"king",14));
        person1.printPersonCards();

        Person person2=new Person(name2);
        person2.addCard(new Card(CardType.Heart,"5",5));
        person2.addCard(new Card(CardType.Diamonds,"9",9));
        person2.printPersonCards();

        people.add(person1);
        people.add(person2);

        Person communityCards=new Person("Community cards");
        communityCards.addCard(new Card(CardType.Club,"Ace",15));
        communityCards.addCard(new Card(CardType.Spades,"3",3));
        communityCards.addCard(new Card(CardType.Diamonds,"Queen",12));
        communityCards.addCard(new Card(CardType.Spades,"8",8));
        communityCards.addCard(new Card(CardType.Club,"5",5));
        communityCards.printPersonCards();

        for (int i = 0; i < person1.getPersonCards().size(); i++) {
            allPerson1.add(person1.getPersonCards().get(i));
            allPerson2.add(person2.getPersonCards().get(i));
        }
        for (int i = 0; i < communityCards.getPersonCards().size(); i++) {
            allPerson1.add(communityCards.getPersonCards().get(i));
            allPerson2.add(communityCards.getPersonCards().get(i));
        }
        HandResolver result1=new HandResolver(allPerson1);
        HandResolver result2=new HandResolver(allPerson2);

        System.out.println("First person's combination");
        result1.printComb();

        System.out.println("Second person's combination");
        result2.printComb();
        MultipleWinner multipleWinner=new MultipleWinner(people,communityCards.getPersonCards());
        multipleWinner.winnerFinder();
    }
}
