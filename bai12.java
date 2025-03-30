package lap1;

public class bai12 {
        public static boolean kiemTraSoDoiXung(int so) {
            if (so < 0) {
                return false;
            }
   
            String chuoiSo = String.valueOf(so);
            int doDai = chuoiSo.length();

            for (int i = 0; i < doDai / 2; i++) {
                if (chuoiSo.charAt(i) != chuoiSo.charAt(doDai - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
        public static boolean kiemTraSoDoiXung2(int so) {
            if (so < 0) {
                return false;
            }
            
            int soBanDau = so;
            int soDaoNguoc = 0;
  
            while (so > 0) {
                int chuSo = so % 10;
                soDaoNguoc = soDaoNguoc * 10 + chuSo;
                so /= 10;
            }
            return soBanDau == soDaoNguoc;
        }
        public static void main(String[] args) {
            int[] danhSachSo = {121, 12321, 12345, 0, 11, -121};
            
            for (int so : danhSachSo) {
                System.out.println("So " + so + " " + 
                    (kiemTraSoDoiXung(so) ? "la" : "khong phai") + 
                    " so doi xung (1)");
                System.out.println("So " + so + " " + 
                    (kiemTraSoDoiXung2(so) ? "là" : "khong phai") + 
                    " so doi xung (2)");
                System.out.println();
            }
        }
    }

