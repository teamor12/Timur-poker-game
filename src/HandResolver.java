import java.util.List;

public class HandResolver {
    private List<Card> personCards;
    public HandResolver(List<Card> personCards) {
        this.personCards=personCards;
    }

    public int gameComb(){
        int n=0;
        if(Combinations.RoyalFlash(personCards)){
            n=1;
        } else if (Combinations.FourOfKind(personCards)) {
            n=2;
        } else if (Combinations.FullHouse(personCards)) {
            n=3;
        } else if (Combinations.Flush(personCards)) {
            n=4;
        } else if (Combinations.Straight(personCards)) {
            n=5;
        } else if (Combinations.ThreeOfKind(personCards)) {
            n=6;
        } else if (Combinations.Pair(personCards)) {
            n=7;
        } else if (Combinations.TwoOfKind(personCards)) {
            n=8;
        } else{
            n=9;
        }
        return n;
    }
    public void printComb(){
        int n=gameComb();
        switch (n){
            case 1 -> System.out.println("Royal flash");
            case 2-> System.out.println("Four of kind");
            case 3-> System.out.println("Full house");
            case 4-> System.out.println("Flush");
            case 5-> System.out.println("Straight");
            case 6-> System.out.println("Three of kind");
            case 7-> System.out.println("Pair");
            case 8-> System.out.println("Two of kind");
        }
    }
}
