import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(0);
        System.out.println(arrayList); //in arrayList
        System.out.println("--------------");
        Iterator<Integer> iter = arrayList.iterator();
        while(iter.hasNext()) {
            int x = iter.next(); // tra ve kieu Wrapper Class --> Auto Unboxing (chuyen kieu wrapper cha (Integer) ve con - kieu du lieu co ban (int)
                                // Integer --> int
                                // int --> Integer (Auto boxing)
            System.out.println(x);
        }

        System.out.println("--------------");
        ArrayList<Object> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add("Hello");
        arrayList2.add(true);
        arrayList2.add(1.45);

        Integer x = (Integer) arrayList2.get(0);
        System.out.println(x);
        String s = (String) arrayList2.get(1);
        System.out.println(s);
    }
}
