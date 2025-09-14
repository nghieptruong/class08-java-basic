package java8demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListCompareDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Anna", "Beth", "Peth");
        //Giai thuat:
        //Output: Anna, Beth, Hello, Peth
        //new ArrayList: chứa giá trị sau sort : Anna, Beth, Hello, Peth
        //1. duyet list tren --> compare tung phan tu voi phan tu trong list moi -> swap gia tri (giai thuat swap)
        //2. Collections

//        //step1: sort tang dan
//        Collections.sort(list);
//        System.out.println(list); // Anna, Beth, Hello, Peth
//
//        //sap xep giam dan
//        //step2: reverse
//        Collections.reverse(list);// dao nguoc
//        System.out.println(list); // Peth, Hello, Beth, Anna

        System.out.println("--------------------");
        //sap xep tang dan
        Comparator<String> ascComparator = (o1, o2) -> o1.compareTo(o2);
        Collections.sort(list, ascComparator);
        System.out.println(list); // tang dan

        //sap xep giam dan
        Comparator<String> descComparator = (o1, o2) -> o2.compareTo(o1);
        Collections.sort(list, descComparator);
        System.out.println(list); // giam dan

        //Su dung Method Reference
        Collections.sort(list, String::compareTo);
        System.out.println(list); // tang dan
    }
}
