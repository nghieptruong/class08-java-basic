public class ExForLoop {

    public static void main(String[] args) {
        //Có số n = 11. Tính tổng các số chẵn từ 0 tới n
        //Ví dụ: 0 1 2 3 4 5 6 7 8 9 10 11
        //2 + 4 + 6 + 8 + 10 = 30
        //Goi ý: dùng vòng for (<= n), if (x % 2 == 0), in ra tổng

        //step1: khai bao bien kieu so int n = 11
        //step2: vong lap for chay tu 0 toi n
        //       if: check dieu kien so chan
        //step3: khi dieu kien thoa. bien sum, cong cac so chan lai voi nhau

        int n = 11;
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0)
                sum += i; // sum = sum + i
        }
        System.out.println(sum);

//        int x = 0;
//        int sumWhile = 0;
//        while(x <= n) {
//            if(x % 2 == 0) // kiem tra so chan
//                sumWhile += x; // sum = sum + i
//            x++;
//        }
//        System.out.println(sumWhile);
//
//        int a = 0;
//        int sumDoWhile = 0;
//        do {
//            if(a % 2 == 0) // kiem tra so chan
//                sumDoWhile += a; // sum = sum + i
//            a++;
//        } while(a <= n);
//        System.out.println(sumDoWhile);
    }
}
