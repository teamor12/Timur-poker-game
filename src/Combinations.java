import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Combinations {
    private static final List<String> numbers=List.of("2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace");
    private static final CardType[] values = CardType.values();
    public static boolean RoyalFlash(List<Card> personCards){
        int count=0;
        int consequency=0;
        int[] cntType  = new int[] {0,0,0,0};
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        Map<String,Integer> numMap =new HashMap<>();
        for (CardType value : values) {
            typeMap.put(value,0);
        }
        for (String number : numbers) {
            numMap.put(number,0);
        }
        for (Card card : personCards) {
            addType(typeMap,card.getCardType());
            addNum(numMap,card.getCardNum());
        }
        for (CardType value : values) {
            if(typeMap.get(value)==5){
                count++;
                break;
            }
        }
        for (String number : numbers) {
            if(numbers[])
        }
    }
    private static void addType(Map<CardType, Integer> map,CardType key ){
        int oldValue=map.get(key);
        map.put(key,oldValue+1);
    }
    private static void addNum(Map<String,Integer> map,String key){
        int oldValue=map.get(key);
        map.put(key,oldValue+1);
    }
}
//for (CardType value : values) {
//                if(card.getCardType()==value){
//                    count=count++;
//                }
//            }
