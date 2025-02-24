package LAP1;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("nhap chieu cao: ");
        double chieucao = Scanner.nextDouble();

        System.out.print("nhap chieu rong: ");
        double chieurong = Scanner.nextDouble();

        double dientich = chieucao * chieurong;

        System.out.println("dien tich hcn = " + dientich);
    }

}
