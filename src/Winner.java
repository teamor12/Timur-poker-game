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
    private final List<String> numbers=List.of("2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace");
    private final CardType[] values = CardType.values();
    int[] cnt  = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    private List<Card> personInitialCards;
    private List<Card> person1InitialCards;
    private List<Card> communityCards;
    private List<Card> person1Cards;
    private List<Card> person2Cards;


    public Winner( List<Card> personInitialCards, List<Card> person1InitialCards, List<Card> communityCards) {
        person1Cards.addAll(personInitialCards);
        person1Cards.addAll(communityCards);

        person2Cards.addAll(person1InitialCards);
        person2Cards.addAll(communityCards);
    }
    public int convert(String value){
        if(value!="Queen"||value!="King"||value!="Ace"||value!="Jack"||value!="10"){
            char converting =value.charAt(0);
            return (int) converting;
        }
        else if (value=="10") {
            return 10;
        }
        else if(value=="Jack"){
            return 11;
        }
        else if(value=="Queen"){
            return 12;
        }
        else if(value=="King"){
            return 13;
        }
        else if(value=="Ace"){
            return 14;
        }
        throw new RuntimeException();
    }
    public int[] checkNumbers(List<Card> personCards){
        int[] ct  = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (Card personCard : personCards) {
            ct[convert(personCard.getCardNum())-2] +=1;
        }
        return ct;
    }

    public int compare1() {
        int count=0;
        int consequency=0;
        int consequentNumbers=0;
        int sameNum=0;
        int result=0;
        for (Card card : person1Cards) {
            for (CardType value : values) {
                if(card.getCardType()==value){
                    count=count++;
                }
            }
            for (String number : numbers) {
                if(card.getCardNum()==number){
                    consequentNumbers= Integer.parseInt(card.getCardNum());
                    sameNum=0;
                }
            }
        }
    }
}
