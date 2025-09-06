public class StringDemo {
    public static void main(String[] args) {
        //String is immutable (bất biến), thao tác xong, tạo 1 chuỗi mới
        String s = "Hello";
        String a = s.toUpperCase(); // in hoa (tao ra 1 chuỗi mới trong memory)
        System.out.println("s = " + s); //Hello
        System.out.println("a = " + a); //HELLO

        System.out.println(s.length()); // in ra do dai cua chuoi --> 5

        char c = s.charAt(0);
        System.out.println(c); // H
        char c1 = s.charAt(1); // e
        System.out.println(c1);
        char c2 = s.charAt(s.length()-1); // in ra gia tri last index --> o
        System.out.println(c2);

        String b1 = "Hello";
        String b2 = "Hello";
        //compareTo: dựa trên giá trị ASCII value
        //1. 2 chuoi giong nhau --> 0
        //2. chuoi b1 < chuoi b2 --> <0 (example: -1)
        //3. chuoi b1 > chuoi b2 --> >0 (example: 1)
        //e = 101
        //d = 100
        System.out.println(b2.compareTo(b1));

        System.out.println("-------------");
        char z1 = 'H';
        int num1 = (int) z1; // chuyen sang ascii value
        System.out.println(num1);

        System.out.println("-----------");
        char k1 = 'f'; // khai bao ky tu
        //ep kieu tu String sang char ???
        String s3 = "fff";
//        char k2 = (char) s3; // lỗi ko dc phép cast từ String sang char
        //s3 chuyen sang char dc ko  ?
        //java giai quyet van de nay bang array: char[]
        char[] arr = s3.toCharArray();
        System.out.println(arr[0]); // f
        System.out.println(arr[1]); // f
        System.out.println(arr[2]); // f
    }
}
