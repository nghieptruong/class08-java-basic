package java8demo;

public class DemoGenericMethod {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        printArray(intArr);
        System.out.println("----------------");
        Double[] doubleArr = {1.1, 2.2, 3.3, 4.4, 5.5};
        printArray(doubleArr);
        System.out.println("------------------");
        Short[] shortArr = {1, 2 ,3, 4, 5};
        printArray(shortArr);
    }
    public static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Hello" + arr[i]);
        }
    }

}
