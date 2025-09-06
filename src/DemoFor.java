public class DemoFor {
    public static void main(String[] args) {
        // lap may lan
        // 4 - 0 + 1 = 5 lan
        // 19 - 12 + 1 = 8 lan
        // 20 - 12 + 1 = 9 lan
        for(int i = 12; i <= 20; i++) {
            System.out.println("Hello World");
        }
        //i = 0 -> 0 < 5 ->  System.out.println("Hello World");
        //i = 1 -> 1 < 5 ->  System.out.println("Hello World");
        //i = 2 -> 2 < 5 ->  System.out.println("Hello World");
        //i = 3 -> 3 < 5 ->  System.out.println("Hello World");
        //i = 4 -> 4 < 5 ->  System.out.println("Hello World");
        //i = 5 -> 5 < 5 -> false

        /*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *

         */
        int n = 7;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // i = 1 -> 1 <= 5 --> for j: j = 1 -> j <= 5 -> in ra *
        //                            j = 2 -> j <= 5 -> in ra *
        //                            j = 3 -> j <= 5 -> in ra *
        //                            j = 4 -> j <= 5 -> in ra *
        //                            j = 5 -> j <= 5 -> in ra *
        //                                               * * * * *
        // in xuong hang
        // i = 2 -> 2 <= 5 --> for j: j = 1 -> j <= 5 -> in ra *
        //                            j = 2 -> j <= 5 -> in ra *
        //                            j = 3 -> j <= 5 -> in ra *
        //                            j = 4 -> j <= 5 -> in ra *
        //                            j = 5 -> j <= 5 -> in ra *
        //                                               * * * * *
    }
}
