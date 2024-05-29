import java.util.*;

public class Combinations {
    public static boolean RoyalFlash(List<Card> personCards) {
        int consequency = 1;
        Card value2 ;
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        Map<String, Integer> numMap = new HashMap<>();
        sort(personCards);
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
        return consequency == 5 && contains;
    }

    public static boolean FourOfKind(List<Card> personCards) {
        Map<String, Integer> numMap = new HashMap<>();
        for (Card card : personCards) {
            mergeNum(numMap, card.getCardNum());
        }
        return numMap.values().stream().anyMatch(x->x==4);
    }

    public static boolean FullHouse(List<Card> personCards) {
        Map<String, Integer> numMap = new HashMap<>();
        for (Card card : personCards) {
            mergeNum(numMap, card.getCardNum());
        }
        boolean contains1=numMap.containsValue(3);
        boolean contains2=numMap.containsValue(2);
        return contains1 && contains2;
    }

    public static boolean Flush(List<Card> personCards) {
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        sort(personCards);
        for (Card card : personCards) {
            mergeType(typeMap,card.getCardType());
        }
        return typeMap.values().stream().anyMatch(x->x==5);
    }

    public static boolean Straight(List<Card> personCards) {
        int consequency = 1;
        Card value2 ;
        Map<String, Integer> numMap = new HashMap<>();
        sort(personCards);
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
        return consequency == 5;
    }

    public static boolean ThreeOfKind(List<Card> personCards) {
        Map<String, Integer> numMap = new HashMap<>();
        for (Card card : personCards) {
            mergeNum(numMap, card.getCardNum());
        }
        return numMap.values().stream().anyMatch(x->x==3);
    }
    public static boolean TwoPair(List<Card> personCards){
        Map<String, Integer> numMap = new HashMap<>();
        for (Card card : personCards) {
            mergeNum(numMap, card.getCardNum());
        }
        long contains=numMap.values().stream().filter(x->x==2).count();

        return contains >= 2;
    }
    public static boolean TwoOfKind(List<Card> personCards) {
        Map<String, Integer> numMap = new HashMap<>();
        for (Card card : personCards) {
            mergeNum(numMap, card.getCardNum());
        }
        return numMap.values().stream().anyMatch(x->x==2);
    }

    public static Card compare(List<Card> personCards){
        sort(personCards);
        return personCards.get(personCards.size()-1);
    }

    private static void mergeType(Map<CardType, Integer> map, CardType key) {
        map.merge(key,1 , Integer::sum);
    }

    private static void mergeNum(Map<String, Integer> map, String key) {
        map.merge(key,1 , Integer::sum);
    }
    public static List<Card> sort(List<Card> personcards) {
        personcards.sort(Comparator.comparingInt(Card::getCardIndex));
        return personcards;
    }
}
