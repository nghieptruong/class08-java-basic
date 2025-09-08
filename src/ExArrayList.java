import java.util.*;

public class ExArrayList {
    public static void main(String[] args) {
//        Có 1 array list kiểu chuỗi: "Hello", "Hello", "Java", "World", "Java", "World"
//        Remove duplicate item (remove item bị trùng)
//        Yêu cầu: chỉ sử dụng ArrayList và duyệt phần tử
//        Kết quả: 1 array list mới (ko có giá trị trùng lắp)
//        Ví du: "Hello", "Java", "World"

        List<String> originalList = Arrays.asList("Hello", "Hello", "Java", "World", "Java", "World");
        List<String> newList = new ArrayList<>();

        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("C#");
        newLinkedList.add("Python");

        Stack<String> stack = new Stack<>();
        stack.add("Kotlin");
        stack.add("Groovy");

        Vector<String> vector = new Vector<>();
        vector.add("Javascript");
        vector.add("Typescript");

//        ArrayList<String> newList = new ArrayList<>();
//        newList = new LinkedList<>();

        for(String s : originalList) {
            if(!newList.contains(s)) {
                newList.add(s);
            }
        }
        System.out.println(newList); // "Hello", "Java", "World"

        print(newLinkedList); // linkedlist
        print(newList); // arraylist
        print(stack); // stack
        print(vector); // vector

    }
    public static void print(List<String> list) {
        System.out.println(list);
    }
}
