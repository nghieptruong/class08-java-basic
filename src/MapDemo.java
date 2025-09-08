import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "Java");
        map.put(3, "Python");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer,String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key = " + key + " Value = " + value);
        }
        System.out.println("------------");
        List<String> originalList = Arrays.asList("Hello", "Hello", "Java", "World", "Java", "World");
        //count mỗi phần tử xuất hiện bao nhiêu lần
        //Hello: 2
        //Java: 2
        //World: 2
        Map<String,Integer> mapResult = new HashMap<>();
        for(String s : originalList) {
            if(mapResult.containsKey(s)) {
                int value = mapResult.get(s);
                value++;
                mapResult.put(s, value);
            } else {
                mapResult.put(s, 1);
            }
        }
        Set<Map.Entry<String, Integer>> setCountDuplicate = mapResult.entrySet();
        Iterator<Map.Entry<String, Integer>> iterCountDuplicate = setCountDuplicate.iterator();
        while(iterCountDuplicate.hasNext()) {
            Map.Entry<String, Integer> entry = iterCountDuplicate.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key = " + key + " Value = " + value);
        }
    }
}
