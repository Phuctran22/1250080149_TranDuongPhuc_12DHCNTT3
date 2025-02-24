package LAP1;
import java.util.Scanner;
public class bai11 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int num = 1234, reversed = 0;
    
    System.out.println("Nhap so: " );

    while(num != 0) {
    
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      num /= 10;
    }

    System.out.println("so dao nguoc: " + reversed);
  }

}
