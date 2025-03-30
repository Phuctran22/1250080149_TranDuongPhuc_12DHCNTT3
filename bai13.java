package lap1;
import java.util.Scanner;
public class bai13 {
        public static int demSoTu(String chuoi) {
            if (chuoi == null || chuoi.trim().isEmpty()) {
                return 0;
            }

            String[] mangTu = chuoi.trim().split("\\s+");
            return mangTu.length;
        }
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhap mot chuoi:");
            String chuoiNhap = scanner.nextLine();
       
            int soTu = demSoTu(chuoiNhap);
            System.out.println("So tu trong chuoi: " + soTu);
            scanner.close();
        }
}

