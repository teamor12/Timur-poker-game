import java.util.*;
import java.util.stream.Collectors;

public class MultipleWinner {
    List<Person> people;
    List<Card> communityCards;
    Map<Integer,List<Person>> winnersMap=new HashMap<>();

    public MultipleWinner(List<Person> people, List<Card> communityCards) {
        this.people = people;
        this.communityCards = communityCards;
    }

    public void winnerFinder(){
        for (Person person : people) {
            List<Card> handCards=new ArrayList<>();
            for (int i = 0; i < 2; i++) {
                handCards.add(person.getPersonCards().get(i));
            }
            for (int i = 0; i < 5; i++) {
                handCards.add(communityCards.get(i));
            }
            HandResolver handResolver=new HandResolver(handCards);
            int combination=handResolver.gameComb();
            handResolver.printComb();
            if (!winnersMap.containsKey(combination)) {
                winnersMap.put(combination,List.of(person));
            }
            else{
                List<Person> players=winnersMap.get(combination);
                ArrayList<Person> allPlayer=new ArrayList<>(players);
                allPlayer.add(person);
                winnersMap.put(combination,allPlayer);
            }
        }
        Optional<Map.Entry<Integer,List<Person>>> max= winnersMap.entrySet()
                .stream()
                .min(Map.Entry.comparingByKey());
        boolean present= max.isPresent();
        if(!present){
            return;
        }
        Map.Entry<Integer, List<Person>> entry=max.get();
        List<Person> personList=entry.getValue();

        if(personList.size()>1){
            Map<Card, Person> collect = personList.stream()
                    .collect(Collectors.toMap(person -> person.biggestCard().orElse(null), person -> person,
                            (existing, replacement) -> existing));
            if(collect.size()>1){
                Optional<Person> person = collect.values().stream().max(Comparator.comparing(x -> x.biggestCard().get().getCardIndex()));
                person.ifPresent(System.out::println);
            }
            else {
                Collection<Person> values=collect.values();
                for (Person value : values) {
                    System.out.println(value.getName()+"is winner");
                }
            }
        }else{
            System.out.println(personList.get(0).getName()+"is winner");
        }
    }
}
