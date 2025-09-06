public class ReturnDemo {
    public static void main(String[] args) {
//        int i = 3;
//        System.out.println("Hello Program");
//        if(i == 3)
//            return;
//        System.out.println("See you again!"); //in dong nay

        int a = 1;
        int b = 2;
        int result = sum(a, b); // tra ve ket qua la tong 2 so ==> tra ve so 3
        System.out.println(result); // in ra 3
    }
    public static int sum(int x, int y) {
        int result = x + y;
        return result;
    }
}
