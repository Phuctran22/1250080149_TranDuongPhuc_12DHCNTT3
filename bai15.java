package lap1;
import java.util.Scanner;
public class bai15 {
        public static void tachNgayThangNam(String ngayThang) {
            if (ngayThang == null || ngayThang.trim().isEmpty()) {
                System.out.println("Chuoi rong!");
                return;
            }
            ngayThang = ngayThang.trim();
            String[] mangPhan = ngayThang.split("[/\\-.]");

            if (mangPhan.length != 3) {
                System.out.println("dinh dang khong hop le!");
                return;
            }
            
            try {
                int ngay = Integer.parseInt(mangPhan[0].trim());
                int thang = Integer.parseInt(mangPhan[1].trim());
                int nam = Integer.parseInt(mangPhan[2].trim());
                if (ngay < 1 || ngay > 31 || thang < 1 || thang > 12 || nam < 1) {
                    System.out.println("Ngay, thang, nam khong hop le!");
                    return;
                }
               
                System.out.println("Ngay: " + ngay);
                System.out.println("Thang: " + thang);
                System.out.println("Nam: " + nam);
                
            } catch (NumberFormatException e) {
                System.out.println("Lphai nhap so cho ngay, thang, nam!");
            }
        }
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Nhap ngay/thang/nam (dd/mm/yyyy):");
            String ngayThang = scanner.nextLine();
            
            tachNgayThangNam(ngayThang);
            
            scanner.close();
        }
    }

