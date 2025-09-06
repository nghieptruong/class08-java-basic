public class DemoSwitchCase {
    public static void main(String[] args) {
//        int x = 0;
//        switch (x) {
//            case -1:
//                System.out.println("x == -1");
////                break; // --> exit
//            case 1:
//                System.out.println("x == 1");
//                break;
//            default:
//                System.out.println("khong thoa dieu kien nao het");
//        }

        String browser = "Edge";
//        switch (browser) {
//            case "Chrome":
//            case "Firefox":
//            case "Edge":
//            case "Chrome_Headless":
//            case "Firefox_Headless":
//                System.out.println("Run on Windows platform");
//                break;
//            default:
//                System.out.println("Run on Mac platform\"");
//        }

        if(browser.equals("Chrome") || browser.equals("Firefox") || browser.equals("Edge") || browser.equals("Chrome_Headless")) {
            System.out.println("Run on Windows platform");
        } else{
            System.out.println("Run on Mac platform\"");
        }

    }
}
