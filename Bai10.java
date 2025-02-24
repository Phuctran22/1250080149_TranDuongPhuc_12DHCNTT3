package LAP1;
import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int number, count = 0;

        System.out.print("Nhap vao so nguuyen duong: ");
        number = Scanner.nextInt();
 
        while (number <= 0) {
            System.out.println("so nhap vao phai lon hon 0. moi nhap lai: ");
            number = Scanner.nextInt();
        }
        while (number > 0) {
            number /= 10;
            count++;   
        }
         
        System.out.println("so cac chu so = " + count);
    }
 
}
