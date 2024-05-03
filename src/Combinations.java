import java.util.*;

public class Combinations {
    private static final List<String> numbers = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
    private static final CardType[] values = CardType.values();

    public static boolean RoyalFlash(List<Card> personCards) {
        int count = 0;
        int consequency = 0;
        int value2 = 0;
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        Map<String, Integer> numMap = new HashMap<>();
        personCards=sort(personCards);
        for (CardType value : values) {
            typeMap.put(value, 0);
        }
        for (String number : numbers) {
            numMap.put(number, 0);
        }
        for (Card card : personCards) {
            addType(typeMap, card.getCardType());
            addNum(numMap, card.getCardNum());
        }
        for (CardType value : values) {
            if (typeMap.get(value) >= 5) {
                count++;
                break;
            }
            for (int i = 0; i < numbers.size() - 1; i++) {
                int value1 = numMap.get(value);
                if (value1 >= 1 && value2 >= 1) {
                    consequency = +1;
                } else if (consequency < 5) {
                    consequency = 0;
                }
            }
            value2 = numMap.get(value);
        }
        if (consequency >= 5 && count == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean FourOfKind(List<Card> personCards) {
        boolean cnt = false;
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        Map<String, Integer> numMap = new HashMap<>();
        personCards=sort(personCards);
        for (String number : numbers) {
            numMap.put(number, 0);
        }
        for (Card card : personCards) {
            addNum(numMap, card.getCardNum());
        }
        for (CardType value : values) {
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numMap.get(value) == 4) {
                    cnt = true;
                    break;
                }
            }
        }
        if (cnt) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean FullHouse(List<Card> personCards) {
        boolean cnt = false;
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        Map<String, Integer> numMap = new HashMap<>();
        personCards=sort(personCards);
        for (String number : numbers) {
            numMap.put(number, 0);
        }
        for (Card card : personCards) {
            addNum(numMap, card.getCardNum());
        }
        for (CardType value : values) {
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numMap.get(value) == 3) {
                    cnt = true;
                    break;
                }
            }
        }
        if (cnt) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Flush(List<Card> personCards) {
        int count = 0;
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        Map<String, Integer> numMap = new HashMap<>();
        personCards=sort(personCards);
        for (CardType value : values) {
            typeMap.put(value, 0);
        }
        for (String number : numbers) {
            numMap.put(number, 0);
        }
        for (Card card : personCards) {
            addType(typeMap, card.getCardType());
            addNum(numMap, card.getCardNum());
        }
        for (CardType value : values) {
            if (typeMap.get(value) >= 5) {
                count++;
                break;
            }
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Straight(List<Card> personCards) {
        int consequency = 0;
        int value2 = 0;
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        Map<String, Integer> numMap = new HashMap<>();
        personCards=sort(personCards);
        for (CardType value : values) {
            typeMap.put(value, 0);
        }
        for (String number : numbers) {
            numMap.put(number, 0);
        }
        for (Card card : personCards) {
            addType(typeMap, card.getCardType());
            addNum(numMap, card.getCardNum());
        }
        for (CardType value : values) {
            for (int i = 0; i < numbers.size() - 1; i++) {
                int value1 = numMap.get(value);
                if (value1 >= 1 && value2 >= 1) {
                    consequency = +1;
                } else if (consequency < 5) {
                    consequency = 0;
                }
            }
            value2 = numMap.get(value);
        }
        if (consequency >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean ThreeOfKind(List<Card> personCards) {
        boolean cnt = false;
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        Map<String, Integer> numMap = new HashMap<>();
        personCards=sort(personCards);
        for (String number : numbers) {
            numMap.put(number, 0);
        }
        for (Card card : personCards) {
            addNum(numMap, card.getCardNum());
        }
        for (CardType value : values) {
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numMap.get(value) == 3) {
                    cnt = true;
                    break;
                }
            }
        }
        if (cnt) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean TwoPair(List<Card> personCards){
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        Map<String, Integer> numMap = new HashMap<>();
        personCards=sort(personCards);
        int  cnt=0;
        for (String number : numbers) {
            numMap.put(number, 0);
        }
        for (Card card : personCards) {
            addNum(numMap, card.getCardNum());
        }
        for (CardType value : values) {
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numMap.get(value) == 2) {
                    cnt++;

                }
            }
        }
        if (cnt==2) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean TwoOfKind(List<Card> personCards) {
        boolean cnt = false;
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        Map<String, Integer> numMap = new HashMap<>();
        personCards=sort(personCards);
        for (String number : numbers) {
            numMap.put(number, 0);
        }
        for (Card card : personCards) {
            addNum(numMap, card.getCardNum());
        }
        for (CardType value : values) {
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numMap.get(value) == 2) {
                    cnt = true;
                    break;
                }
            }
        }
        if (cnt) {
            return true;
        } else {
            return false;
        }
    }
    public static int BiggestCard(List<Card> personCards1 , List<Card> personCards2){
        Card card1=compare(personCards1);
        Card card2=compare(personCards2);
        List<Card> compareCards =List.of(card1,card2);
        compareCards=sort(compareCards);
        if(compareCards.get(0) ==card1){
            return 1;
        }
        else {
            return 2;
        }
    }
    public static Card compare(List<Card> personCards){
        boolean cnt = false;
        Map<CardType, Integer> typeMap = new EnumMap<>(CardType.class);
        Map<String, Integer> numMap = new HashMap<>();
        personCards=sort(personCards);
        return personCards.get(personCards.size() - 1);
    }

    private static void addType(Map<CardType, Integer> map, CardType key) {
        int oldValue = map.get(key);
        map.put(key, oldValue + 1);
    }

    private static void addNum(Map<String, Integer> map, String key) {
        int oldValue = map.get(key);
        map.put(key, oldValue + 1);
    }
    public static List<Card> sort(List<Card> personcards) {
        Collections.sort(personcards, Comparator.comparingInt(card -> numbers.indexOf(card.getCardNum())));
        return personcards;
    }

    private static int getIndex(String card) {
        return numbers.indexOf(card);
    }
}
