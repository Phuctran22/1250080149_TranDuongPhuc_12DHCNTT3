package LAP1;
import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("nhap diem mon ly: ");
        double Ly = Scanner.nextDouble();
        System.out.print("nhap diem mon hoa: ");
        double Hoa = Scanner.nextDouble();
        System.out.print("nhap diem mon sinh: ");
        double Sinh = Scanner.nextDouble();
        System.out.print("nhap diem mon toan: ");
        double Toan = Scanner.nextDouble();
        System.out.print("nhap diem mon may tinh: ");
        double Maytinh = Scanner.nextDouble();
        
        double TongDiem = Ly+Hoa+Sinh+Toan+Maytinh;
        double DiemTB = (TongDiem/5)*10;

        String XepHang;
        if (DiemTB>90) {
            XepHang = "Xep hang A";
        } else if (DiemTB>80) {
            XepHang = "Xep hang B";
        } else if (DiemTB>70) {
            XepHang = "Xep hang C";
        } else if (DiemTB>60) {
            XepHang = "Xep hang D";
        } else if (DiemTB>40) {
            XepHang = "Xep hang E";
        } else {
            XepHang = "Xep hang F";
        }

        System.out.println("ty le phan tram: " +DiemTB);
        System.out.println("xep hang: "+XepHang);
}
}
