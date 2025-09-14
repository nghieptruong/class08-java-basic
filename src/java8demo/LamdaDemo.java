package java8demo;

public class LamdaDemo {
    public static void main(String[] args) {
        Calculator calc = (a, b) -> a + b;

        //Su dung calc khai bao o tren
        int result = calc.sum(1, 2);
        System.out.println(result); // 3
    }
}
