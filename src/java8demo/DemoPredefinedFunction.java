package java8demo;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoPredefinedFunction {
    public static void main(String[] args) {
        //Bai toan: Tao 1 function kiểm tra 1 chuỗi giá trị xuất hien bao nhiêu lần trong 1 danh sách
        List<String> originalList = Arrays.asList("Hello", "Hello", "Java", "World", "Java", "World");
        //count mỗi phần tử xuất hiện bao nhiêu lần
        //Hello: 2
        //Java: 2
        //World: 2
        //1. cách 1: goi findDuplicated
        int count1 = findDuplicated(originalList, "Hello");
        System.out.println(count1); // 2

        System.out.println("-----------------------");
        //2. cách 2: sử dụng BiFunction<T, U, R> --> input T, U, trả về R
        BiFunction<List<String>, String, Integer> biFuncFindDup = DemoPredefinedFunction::findDuplicated;
        int count2 = biFuncFindDup.apply(originalList, "Hello"); // 2
        System.out.println(count2);

        System.out.println("------------------------");
        //Bai toan 2: nhap 1 gia tri chuoi la "Heello" --> ký tự xuat hien nhieu nhat
        //Function<T, R> --> T: String, R: List<Character>
        Function<String, List<String>> findMaxDuplicated = (String original) -> {
            List<String> listDuplicated = new ArrayList<>();
            Map<String, Integer> mapCount = new HashMap<>();
            List<String> stringList = List.of(original.split(""));
            int duplicatedMax = Integer.MIN_VALUE;
            for(String s: stringList) {
                int occurence = findDuplicated(stringList, s);
                mapCount.putIfAbsent(s, occurence);
                if(occurence >= duplicatedMax) {
                    duplicatedMax = occurence;
                }
            }
            Set<Map.Entry<String, Integer>> setCountDuplicate = mapCount.entrySet();
            Iterator<Map.Entry<String, Integer>> iterCountDuplicate = setCountDuplicate.iterator();
            while(iterCountDuplicate.hasNext()) {
                Map.Entry<String, Integer> entry = iterCountDuplicate.next();
                String key = entry.getKey();
                int value = entry.getValue();
                System.out.println("Key = " + key + " Value = " + value);
                if(value == duplicatedMax)
                    listDuplicated.add(key);
            }
            return listDuplicated;
        };
        List<String> list = findMaxDuplicated.apply("Heello");
        System.out.println(list); // e, l
    }
    public static int findDuplicated(List<String> originalList, String search) {
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
        return mapResult.get(search); // tu cai key -> lay value
    }
}
