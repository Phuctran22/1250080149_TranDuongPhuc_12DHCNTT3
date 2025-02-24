package LAP1;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Nhap ba canh cua tam giac: ");
        int canhA = Scanner.nextInt();
        int canhB = Scanner.nextInt();
        int canhC = Scanner.nextInt();
        
        if ((canhA + canhC) > canhA) {
            if ((canhB+canhC)>canhA) {
                if ((canhA+canhC)>canhB) {
                    System.out.println("tam giac hop le ");
                } else System.out.println("tam giac khong hop le ");
            } else System.out.println("tam giac khong hop le ");
        } else System.out.println("tam giac khong hop le ");
}
}