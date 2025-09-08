import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        List<String> originalList = Arrays.asList("Hello", "Hello", "Java", "World", "Java", "World");

        Set<String> set = new HashSet<>(originalList);
        System.out.println(set); // "Hello", "Java", "World"

        List<String> newList = new ArrayList<>(set);
        System.out.println(newList); // "Hello", "Java", "World"

        System.out.println("---set2---");
        Set<String> set2 = new HashSet<>();
        set2.add("Welcome");
        set2.add("Programming");
        set2.add("World");
        System.out.println(set2); // HashSet in ra ko theo thứ tự insert vào

        System.out.println("---set3---");
        Set<String> set3 = new LinkedHashSet<>();
        set3.add("Welcome");
        set3.add("Programming");
        set3.add("World"); // LinkedHashSet in ra theo thứ tự insert vào
        System.out.println(set3);

        System.out.println("---set4---");
        Set<String> set4 = new TreeSet<>();
        set4.add("Belcome");
        set4.add("Arogramming");
        set4.add("Corld");
        System.out.println(set4); // TreeSet sort (sap xep)
    }
}
