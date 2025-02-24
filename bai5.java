package LAP1;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("nhap so thu nhat: ");
        double somot = Scanner.nextDouble();

        System.out.print("nhap so thu hai: ");
        double sohai = Scanner.nextDouble();

        System.out.print("nhap so thu ba: ");
        double soba = Scanner.nextDouble();

        double sonhonhat = Math.min(somot, Math.min(sohai, soba));

        System.out.print("so nho nhat la: " + sonhonhat);
}
}