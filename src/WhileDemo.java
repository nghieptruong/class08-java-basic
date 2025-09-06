import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        //Chuong trinh: Hoi so tuoi cua nguoi nhap (can 1 bien int)
        //neu nhap sai thi bat nhap lai (can 1 vong lap)
        //Dat cau hoi: lap bao nhieu lan (while, do-while)

        //Dat ten bien co y nghia

        Scanner sc = new Scanner(System.in);
        int age = -1;
        boolean isContinue = true;
        while(isContinue) {
            try {
                System.out.println("Input age: ");
                age = sc.nextInt(); // nhap ky tu chuoi bi sai -> throw exception
                if(age > 0) {
                    System.out.println("Age = " + age); // truong hop hop le thi in ra
                    isContinue = false; //ko can lap tiep tuc
                }
            } catch (Exception e) {
                sc.nextLine(); // lay ky tu \n
            }
        }

    }
}
