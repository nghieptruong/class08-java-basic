public class HelloWorld {
    public static void main(String[] args) {
        /*
        int x = 5; //khai bao bien va khoi tao gia tri la 5
        System.out.println(x); // in ra gia tri cua bien
        x = 10; // gan lai gia tri
        System.out.println(x);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        */

//        Scanner sc = new Scanner(System.in);
//        int quantity = sc.nextInt();
//        System.out.println(quantity);

        int x = 1;
        int y = 2;
        int result = 1 % 2; //toan tu so du
        System.out.println(result); //? -> 1
        int z = 1;
        z += x; // z = z + x
        System.out.println(z);  // 2
        System.out.println(z == 2); //true

        System.out.println("--------------");
        boolean a = true;
        System.out.println(!a); //false

        boolean b = (z > 0) ? true : false;
        System.out.println(b); // z = 2 (2>0) --> true

        System.out.println("--------------");
        int d = 1;
        d++; // 2 (hau to, postfix)
        System.out.println(d); // 2
        ++d; // tang len 1 --> 3
        System.out.println(d); // 3

        System.out.println("-----------");
//        int e = 1;
//        int f = e++; // tang sau, giu nguyen trước (gán) - 2 buoc: b1: giu nguyen 1 (gán cho f = 1), b2: tang ban than len 1
//        System.out.println(f); // 1
//        System.out.println(e); // 2

        int e = 1;
        int f = ++e; //tang truoc, gán sau (lấy giá trị mới gán) - b1: tăng 1 (e=2), b2:giá trị mới= 2 gán cho f
        System.out.println(f); // 2
        System.out.println(e); // 2

        System.out.println("-----------");
        int c1 = 1;
        int c2 = 2; // 3
        int z1 = c1 + ++c2; //z1 so 4
        System.out.println(z1);

        System.out.println("---------------");
        if(z1 > 0) {
            System.out.println("z1 so nguyen duong");
        } else {
            System.out.println("z1 so nguyen am");
        }

        System.out.println("-----------");
        String s1 = "Hello";
        System.out.println(s1);
        String s2 = "Hello";
        System.out.println(s2);
        System.out.println(s1 == s2); // true 1791741888 == 1791741888 == 1791741888
        String s3 = new String("Hello");
        System.out.println(s3); // Hello
        System.out.println(s1 == s3); // false --> tai sao? 1791741888 == 1595428806 ==> false
        System.out.println("s1.equals(s3)");
        System.out.println(s1.equals(s3)); // true;

        System.out.println("----------");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        String s4 = s3.intern();
        System.out.println(s4);
        System.out.println(System.identityHashCode(s4));

        //khai bao bien int x10;
        int x10 = 0;
        System.out.println(x10); // 0

        System.out.println("----------");
//        secondpackage.Employee p = new secondpackage.Employee();
//        System.out.println(p.age);

        System.out.println("----------");
    }
}
class Person {
    int age; // instance variable
}
