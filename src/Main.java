import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "Иван, Светлана, " +
                "Кристина, Анна, Анна, Иван, " +
                "Петр, Павел, Петр, Мария, Марина, " +
                "Мария, Мария, Марина, " +
                "Анна, Иван, Петр, Иван";
        System.out.println(ex1(s));

    }
    static void ex0(){
        /*
        Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
        что 1 человек может иметь несколько телефонов.
         */
        HashMap<String, List<Integer>> map = new HashMap<>();
        map.put("Иванов", List.of(123456, 234432));
        map.put("Васильев", List.of(55555, 789554));
        map.put("Петрова", List.of(234561, 300111, 554774));
        System.out.println(map);
        System.out.println(map.get("Петрова"));

    }
    static TreeMap<String, Integer> ex1(String s){
        /*
         Пусть дан список сотрудников: Иван Иванов, Светлана Петрова,
         Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
        Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова,
        Мария Савина, Мария Рыкова, Марина Лугова,
        Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу,
        которая найдет и выведет повторяющиеся имена с количеством повторений.
        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
         */


        s = s.replace(",", "");
        String[] words = s.split(" ");
//        System.out.println(Arrays.toString(words));
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (String word: words){
            if (treeMap.containsKey(word)){
                treeMap.replace(word, treeMap.get(word), treeMap.get(word) + 1);
            }else {
                treeMap.put(word, 1);
            }
//        for(Map.Entry<String,Integer> entry : treeMap.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key + " => " + value);
//        }


        }
        return treeMap;
    }

}
