public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE); // 2147483647
        int[] intArr = new int[5];
//        intArr[0] = 1;
        intArr[1] = 5;
        intArr[2] = 4;
        intArr[3] = 0;
        intArr[4] = 7;
//        intArr[5] = 8; // quang loi ArrayIndexOutOfBoundsException
        System.out.println(intArr[0]); // mac dinh in so 0

        System.out.println("-----------------");
        System.out.println(Byte.MAX_VALUE); //127
        byte[] byteArr = new byte[5];
        System.out.println("-------------");
        
        String[] strArr1 = {"Hello", "Java", "World", "Class08", "HCM"};
        for (int i = 0; i < strArr1.length; i++) {
            System.out.println(strArr1[i]);
        }
        System.out.println("---------------");
        //dùng foreach để lặp
        for(String s : strArr1) {
            System.out.println(s);
        }

        System.out.println("-----------------");
        String[] strArr2 = {"Hello", "Java", "World", "Class08", "HCM"};
        String[] strArr3 = {new String("Hello"), "Java", "World", "Class08", "HCM"};
        System.out.println(strArr1 == strArr2); // so sanh dia chi --> false\
        System.out.println("-------------");
        System.out.println(strArr1[0] == strArr2[0]); // true;
        System.out.println(strArr1[0] == strArr3[0]); //false

        String m1 = "Hello";  // dua do string pool

        System.out.println("-------------");
        int[][] arr2D = new int[2][3]; //khai bao mang 2D 2 hang 3 cot
        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[0][2] = 3;

        arr2D[1][0] = 4;
        arr2D[1][1] = 5;
        arr2D[1][2] = 6;

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[0].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

    }
}
