package lap1;
import java.util.Scanner;
public class bai14 {
        public static void tachHoTen(String hoTen) {
            if (hoTen == null || hoTen.trim().isEmpty()) {
                System.out.println("Chuoi rong!");
                return;
            }
            String[] mangTu = hoTen.trim().split("\\s+");
            int soTu = mangTu.length;
  
            String ho = "";
            String tenDem = "";
            String ten = "";
       
            if (soTu == 1) {
                ten = mangTu[0];
            } else if (soTu == 2) {
                ho = mangTu[0];
                ten = mangTu[1];
            } else {
                ho = mangTu[0];
                ten = mangTu[soTu - 1];
                for (int i = 1; i < soTu - 1; i++) {
                    tenDem += mangTu[i] + " ";
                }
                tenDem = tenDem.trim();
            }

            System.out.println("Ho: " + ho);
            System.out.println("Ten dem: " + tenDem);
            System.out.println("Ten: " + ten);
        }
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Nhap ho ten:");
            String hoTen = scanner.nextLine();
            
            tachHoTen(hoTen);
            
            scanner.close();
        }
    }

