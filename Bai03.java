package LAP1;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("nhap nhiet do F: ");
        double NDF = Scanner.nextDouble();

        double NDC = (NDF - 32) / 1.8;

        System.out.print("nhiet do C:" +NDC );
    }
}
