package LAP1;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int Nam = Scanner.nextInt(); 

        boolean Namnhuan = false;

        if (Nam %4 == 0 ) {
            if (Nam %100 != 0 || Nam %400 ==0) {
                Namnhuan = true;
            }
            
        }
        if (Namnhuan) {
            System.out.println(Nam+ "la nam nhuan");
        } else {
            System.out.println(Nam+ "khong phai la nam nhuan");
        }
}
}
