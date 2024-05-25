import java.util.*;

public class Combinations {
    private static final List<String> numbers = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
    private static final CardType[] values = CardType.values();

    public static boolean RoyalFlash(List<Card> personCards) {
        int count = 0;
        int consequency = 1;
        Card value2 ;
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        Map<String, Integer> numMap = new HashMap<>();
        personCards=sort(personCards);
        for (Card card : personCards) {
            mergeType(typeMap,card.getCardType());
            mergeNum(numMap, card.getCardNum());
        }
        boolean contains=typeMap.values().stream().anyMatch(x->x==5);
        for (int i = 0; i < personCards.size()-2; i++) {
            Card value1=personCards.get(i);
            value2=personCards.get(i+1);

            int num1=value1.getCardIndex();
            int num2= value2.getCardIndex();
            if((num1+1)==num2){
                consequency++;
            }
        }
        if (consequency == 5 && contains) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean FourOfKind(List<Card> personCards) {
        Map<String, Integer> numMap = new HashMap<>();
        for (Card card : personCards) {
            mergeNum(numMap, card.getCardNum());
        }
        boolean contains=numMap.values().stream().anyMatch(x->x==4);
        if (contains) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean FullHouse(List<Card> personCards) {
        Map<String, Integer> numMap = new HashMap<>();
        for (Card card : personCards) {
            mergeNum(numMap, card.getCardNum());
        }
        boolean contains1=numMap.containsValue(3);
        boolean contains2=numMap.containsValue(2);
        if (contains1&&contains2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Flush(List<Card> personCards) {
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        personCards=sort(personCards);
        for (Card card : personCards) {
            mergeType(typeMap,card.getCardType());
        }
        boolean contains=typeMap.values().stream().anyMatch(x->x==5);
        if(contains){
            return true;
        }else {
            return false;
        }
    }

    public static boolean Straight(List<Card> personCards) {
        int count = 0;
        int consequency = 1;
        Card value2 ;
        Map<String, Integer> numMap = new HashMap<>();
        personCards=sort(personCards);
        for (Card card : personCards) {
            mergeNum(numMap, card.getCardNum());
        }
        for (int i = 0; i < personCards.size()-2; i++) {
            Card value1=personCards.get(i);
            value2=personCards.get(i+1);
            int num1=value1.getCardIndex();
            int num2= value2.getCardIndex();
            if((num1+1)==num2){
                consequency++;
            }

        }
        if (consequency == 5) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean ThreeOfKind(List<Card> personCards) {
        Map<String, Integer> numMap = new HashMap<>();
        for (Card card : personCards) {
            mergeNum(numMap, card.getCardNum());
        }
        boolean contains=numMap.values().stream().anyMatch(x->x==3);
        if (contains) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean Pair(List<Card> personCards){
        Map<String, Integer> numMap = new HashMap<>();
        for (Card card : personCards) {
            mergeNum(numMap, card.getCardNum());
        }
        long contains=numMap.values().stream().filter(x->x==2).count();

        if (contains>=2) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean TwoOfKind(List<Card> personCards) {
        Map<String, Integer> numMap = new HashMap<>();
        for (Card card : personCards) {
            mergeNum(numMap, card.getCardNum());
        }
        boolean contains=numMap.values().stream().anyMatch(x->x==2);
        if (contains) {
            return true;
        } else {
            return false;
        }
    }
    public static int BiggestCard(List<Card> personCards1 , List<Card> personCards2){
        Card card1=compare(personCards1);
        Card card2=compare(personCards2);
        List<Card> compareCards =new ArrayList<>();
        compareCards.add(card1);
        compareCards.add(card2);
        compareCards=sort(compareCards);
        if(compareCards.get(0) ==card1){
            return 1;
        }
        else {
            return 2;
        }
    }

    public static Card returnBiggestCards(List<Card> personCards1 , List<Card> personCards2,int playerCard){
        Card card1=compare(personCards1);
        Card card2=compare(personCards2);
        if(playerCard==1){
            return card1;
        }
        else{
             return card2;
        }
    }

    public static Card compare(List<Card> personCards){
        personCards=sort(personCards);
        return personCards.get(personCards.size()-1);
    }

    private static void mergeType(Map<CardType, Integer> map, CardType key) {
        map.merge(key,1 , (oldValue , newValue)->newValue+oldValue);
    }

    private static void mergeNum(Map<String, Integer> map, String key) {
        map.merge(key,1 , (oldValue , newValue)->newValue+oldValue);
    }
    public static List<Card> sort(List<Card> personcards) {
        Collections.sort(personcards, Comparator.comparingInt(card ->card.getCardIndex()));
        return personcards;
    }

    private static int getIndex(String card) {
        return numbers.indexOf(card);
    }
}
