package java8demo;

import java.util.function.Predicate;

public class DemoCheckEven {
    public static void main(String[] args) {
        //1. Cách cũ tiếp cận
        CheckEvenInterface checkEven = (x) -> {
            return x % 2 == 0;
        };
        boolean isEven = checkEven.test(4);
        System.out.println(isEven); // true

        //2. Cách mới (sử dụng predefined function)
        Predicate<Integer> checkEven2 = (x) -> {
            return x % 2 == 0;
        };
        boolean isEven2 = checkEven2.test(4);
        System.out.println(isEven2); // true
    }
}
