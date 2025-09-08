public class DemoCalculator {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int result = CalculatorUtils.sumNumbers(num1, num2);
        System.out.println(result); // 3

        float x1 = 1.2f;
        float x2 = 2.2f;
        double result2 = CalculatorUtils.sumNumbers(x1, x2); //giai quyet overloading
        System.out.println(result2);

        int y1 = 1;
        int y2 = 2;
        int y3 = 3;
        int result3 = CalculatorUtils.sumNumbers(y1, y2, y3);
        System.out.println(result3);

        int z1 = 1;
        double z2 = 2.5;
        double result4 = CalculatorUtils.sumNumbers(z1, z2);
        System.out.println(result4);

        double result5 = CalculatorUtils.sumNumbers(z2, z1);
        System.out.println(result5);
    }
}
