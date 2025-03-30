package lap1;

public class bai9 {
        public static int tinhTongCacChuSo(int so) {
            so = Math.abs(so);
            
            int tong = 0;
            while (so > 0) {
                tong += so % 10;
                so /= 10;
            }
            return tong;
        }
        public static long tinhTichCacChuSo(int so) {
            so = Math.abs(so);
            
            long tich = 1;
            while (so > 0) {
                tich *= (so % 10);
                so /= 10;
            }
            return tich;
        }
        public static void main(String[] args) {
            int so = 12345;
            
            System.out.println("So: " + so);
            System.out.println("Tong cac chu so: " + tinhTongCacChuSo(so));
            System.out.println("Tich cac chu so: " + tinhTichCacChuSo(so));

            int soAm = -123;
            System.out.println("\nSo: " + soAm);
            System.out.println("Tong cac chu so: " + tinhTongCacChuSo(soAm));
            System.out.println("Tich cac chu so: " + tinhTichCacChuSo(soAm));
        }
    }
    

