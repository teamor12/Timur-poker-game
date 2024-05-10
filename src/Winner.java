// 4 8 K 5 Q A
// int cnt[14] = {0, 0, 0, }
// function convert Ace->14 King -> 13, Queen -> 12, Jack -> 11,
// cnt[convert(element) - 1] += 1
// if(i >= 3 and check(i))
/*
 check(int pos){

 }
*/
import java.util.ArrayList;
import java.util.List;

public class Winner {
    private List<Card> person1Cards=new ArrayList<>();
    private List<Card> person2Cards=new ArrayList<>();
    private String name1;
    private String name2;
    int bigCard=0;

    public Winner( List<Card> personInitialCards, List<Card> person1InitialCards, List<Card> communityCards,String name1,String name2) {
        bigCard=Combinations.BiggestCard(personInitialCards,person1InitialCards);
        person1Cards.addAll(personInitialCards);
        person1Cards.addAll(communityCards);
        System.out.println("person1:");
        for (Card person1Card : person1Cards) {
            System.out.println(person1Card);
        }
        person2Cards.addAll(person1InitialCards);
        person2Cards.addAll(communityCards);
        System.out.println("person2");
        for (Card person2Card : person2Cards) {
            System.out.println(person2Card);
        }
        this.name1=name1;
        this.name2=name2;
    }
    public int Cards1(){
        int n=0;
        if(Combinations.RoyalFlash(person1Cards)){
            n=1;
        } else if (Combinations.FourOfKind(person1Cards)) {
            n=2;
        } else if (Combinations.FullHouse(person1Cards)) {
            n=3;
        } else if (Combinations.Flush(person1Cards)) {
            n=4;
        } else if (Combinations.Straight(person1Cards)) {
            n=5;
        } else if (Combinations.ThreeOfKind(person1Cards)) {
            n=6;
        } else if (Combinations.TwoPair(person1Cards)) {
            n=7;
        } else if (Combinations.TwoOfKind(person1Cards)) {
            n=8;
        }
        return n;
    }
    public int Cards2(){
        int n=0;
        if(Combinations.RoyalFlash(person2Cards)){
            n=1;
        } else if (Combinations.FourOfKind(person2Cards)) {
            n=2;
        } else if (Combinations.FullHouse(person2Cards)) {
            n=3;
        } else if (Combinations.Flush(person2Cards)) {
            n=4;
        } else if (Combinations.Straight(person2Cards)) {
            n=5;
        } else if (Combinations.ThreeOfKind(person2Cards)) {
            n=6;
        } else if (Combinations.TwoPair(person2Cards)) {
            n=7;
        } else if (Combinations.TwoOfKind(person2Cards)) {
            n=8;
        }
        return n;
    }
    public void result() {
        int first = Cards1();
        int second = Cards2();
        System.out.println(name1+"'s combination:");
        switch (first){
            case 1-> System.out.println("Royal Flash");
            case 2-> System.out.println("Four of kind");
            case 3-> System.out.println("Full house");
            case 4-> System.out.println("Flush");
            case 5-> System.out.println("Straight");
            case 6-> System.out.println("Three of kind");
            case 7-> System.out.println("Two pair");
            case 8-> System.out.println("Two of kind");
            case 0-> System.out.println("No combination");
        }
        System.out.println(name2+"'s combination:");
        switch (second){
            case 1-> System.out.println("Royal Flash");
            case 2-> System.out.println("Four of kind");
            case 3-> System.out.println("Full house");
            case 4-> System.out.println("Flush");
            case 5-> System.out.println("Straight");
            case 6-> System.out.println("Three of kind");
            case 7-> System.out.println("Two pair");
            case 8-> System.out.println("Two of kind");
            case 0-> System.out.println("No combination");
        }
        if (first > second) {
            if(first == 0||second == 0) {
                System.out.println(name2 + " is winner");
            }
        } else if (second > first) {
            if(first == 0||second == 0){
                System.out.println(name1 + " player is winner");
            }
        } else if (first == second && first == 0) {
            if (bigCard == 1) {
                System.out.println(name1+" player is winner");
            } else {
                System.out.println(name2+" player is winner");
            }
        }
        else {
            System.out.println("Tie");
        }
        System.out.println("first="+first);
        System.out.println("second="+second);
    }
}
