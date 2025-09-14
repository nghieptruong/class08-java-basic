package java8demo;

public class Java8CalcUtils {
    public static void main(String[] args) {
        int result1 = Java8CalcUtils.sum(1,2 );
        System.out.println(result1); // 3

        //Java 8 Lambda Expression
        CalcFunctionInterface lbdCalc = (x, y) -> {
            return x + y;
        };
        int result2 = lbdCalc.sum(1, 2);
        System.out.println(result2); // 3

        //Java 8 Method Reference: Class::staticMethod
        CalcFunctionInterface mrCalc = Java8CalcUtils::sum;
        int result3 = mrCalc.sum(1, 2); // 3
        System.out.println(result3);
    }
    public static int sum(int x, int y) {
        return x + y;
    }
}
