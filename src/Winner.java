// 4 8 K 5 Q A
// int cnt[14] = {0, 0, 0, }
// function convert Ace->14 King -> 13, Queen -> 12, Jack -> 11,
// cnt[convert(element) - 1] += 1
// if(i >= 3 and check(i))
/*
 check(int pos){

 }
*/
import java.util.List;

public class Winner {
    private List<Card> communityCards;
    private List<Card> person1Cards;
    private List<Card> person2Cards;
    private String name1;
    private String name2;
    int bigCard=0;

    public Winner( List<Card> personInitialCards, List<Card> person1InitialCards, List<Card> communityCards,String name1,String name2) {
        bigCard=Combinations.BiggestCard(personInitialCards,person1InitialCards);
        person1Cards.addAll(personInitialCards);
        person1Cards.addAll(communityCards);

        person2Cards.addAll(person1InitialCards);
        person2Cards.addAll(communityCards);
        name1=this.name1;
        name2=this.name2;
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
        if (first > second) {
            System.out.println(name1+" is winner");
        } else if (second > first) {
            System.out.println(name2+" player is winner");
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
    }
}
