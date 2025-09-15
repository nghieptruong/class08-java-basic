package java8demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamDemo {
    public static void main(String[] args) {
        //Bai toan: lọc số chẵn -> in ra
        List<Integer> listInt = Arrays.asList(2, 4, 3, 6, 7, 9);
        //cách 1: duyệt for index
        for(int i = 0; i < listInt.size(); i++) {
            int value = listInt.get(i);
            if(value % 2 == 0) //so chan
                System.out.println(value);
        }
        System.out.println("--------------");
        //cách 2: duyệt for each
        for(Integer i : listInt) {
            if(i % 2 == 0) //so chan
                System.out.println(i);
        }
        System.out.println("-------------");
        //cách 3: stream duyet
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        listInt.stream()
                .filter(isEven)
                .forEach(System.out::println);


    }
}
