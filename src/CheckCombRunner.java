public class CheckCombRunner {
    public static void main(String[] args) {

    }
    public static void RoyalFlashAndTwoPair(){
        String name="person1";
        String name2="person2";
        Person person1=new Person(name);
        person1.addCard(new Card(CardType.Club,"2",2));
        person1.addCard(new Card(CardType.Club,"3",3));

        Person person2=new Person(name2);
        person2.addCard(new Card(CardType.Heart,"5",5));
        person2.addCard(new Card(CardType.Diamonds,"7",7));

        Person communityCards=new Person("Community cards");
        communityCards.addCard(new Card(CardType.Club,"4",4));
        communityCards.addCard(new Card(CardType.Club,"5",5));
        communityCards.addCard(new Card(CardType.Club,"6",6));
        communityCards.addCard(new Card(CardType.Diamonds,"4",4));
        communityCards.addCard(new Card(CardType.Spades,"7",7));
        Winner winner=new Winner(person1.getPersonCards(),person2.getPersonCards(),communityCards.getPersonCards(),name,name2);
        winner.result();
    }
    public static void FourofKind(){
        String name="person1";
        String name2="person2";
        Person person1=new Person(name);
        person1.addCard(new Card(CardType.Club,"2",2));
        person1.addCard(new Card(CardType.Heart,"2",2));

        Person person2=new Person(name2);
        person2.addCard(new Card(CardType.Heart,"5",5));
        person2.addCard(new Card(CardType.Diamonds,"7",7));

        Person communityCards=new Person("Community cards");
        communityCards.addCard(new Card(CardType.Diamonds,"2",2));
        communityCards.addCard(new Card(CardType.Spades,"2",2));
        communityCards.addCard(new Card(CardType.Club,"6",6));
        communityCards.addCard(new Card(CardType.Diamonds,"4",4));
        communityCards.addCard(new Card(CardType.Spades,"7",7));
        Winner winner=new Winner(person1.getPersonCards(),person2.getPersonCards(),communityCards.getPersonCards(),name,name2);
        winner.result();
    }
    public static void FullHouse(){
        String name="person1";
        String name2="person2";
        Person person1=new Person(name);
        person1.addCard(new Card(CardType.Club,"2",2));
        person1.addCard(new Card(CardType.Heart,"2",2));

        Person person2=new Person(name2);
        person2.addCard(new Card(CardType.Heart,"5",5));
        person2.addCard(new Card(CardType.Diamonds,"7",7));

        Person communityCards=new Person("Community cards");
        communityCards.addCard(new Card(CardType.Diamonds,"2",2));
        communityCards.addCard(new Card(CardType.Spades,"3",3));
        communityCards.addCard(new Card(CardType.Club,"3",3));
        communityCards.addCard(new Card(CardType.Diamonds,"4",4));
        communityCards.addCard(new Card(CardType.Spades,"7",7));
        Winner winner=new Winner(person1.getPersonCards(),person2.getPersonCards(),communityCards.getPersonCards(),name,name2);
        winner.result();
    }
    public static void FlushAndStraight(){
        String name="person1";
        String name2="person2";
        Person person1=new Person(name);
        person1.addCard(new Card(CardType.Club,"2",2));
        person1.addCard(new Card(CardType.Heart,"2",2));

        Person person2=new Person(name2);
        person2.addCard(new Card(CardType.Heart,"5",5));
        person2.addCard(new Card(CardType.Diamonds,"7",7));

        Person communityCards=new Person("Community cards");
        communityCards.addCard(new Card(CardType.Club,"4",4));
        communityCards.addCard(new Card(CardType.Club,"3",3));
        communityCards.addCard(new Card(CardType.Club,"6",6));
        communityCards.addCard(new Card(CardType.Spades,"4",4));
        communityCards.addCard(new Card(CardType.Club,"7",7));
        Winner winner=new Winner(person1.getPersonCards(),person2.getPersonCards(),communityCards.getPersonCards(),name,name2);
        winner.result();
    }
    public static void ThreeOfKindAndTwoKind(){
        String name="person1";
        String name2="person2";
        Person person1=new Person(name);
        person1.addCard(new Card(CardType.Club,"2",2));
        person1.addCard(new Card(CardType.Heart,"2",2));

        Person person2=new Person(name2);
        person2.addCard(new Card(CardType.Heart,"5",5));
        person2.addCard(new Card(CardType.Diamonds,"7",7));

        Person communityCards=new Person("Community cards");
        communityCards.addCard(new Card(CardType.Club,"9",9));
        communityCards.addCard(new Card(CardType.Spades,"2",2));
        communityCards.addCard(new Card(CardType.Diamonds,"6",6));
        communityCards.addCard(new Card(CardType.Spades,"4",4));
        communityCards.addCard(new Card(CardType.Club,"7",7));
        Winner winner=new Winner(person1.getPersonCards(),person2.getPersonCards(),communityCards.getPersonCards(),name,name2);
        winner.result();
    }
}
