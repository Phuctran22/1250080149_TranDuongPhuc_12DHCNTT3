package LAP1;
import java.util.Scanner;
public class bai8 {
    public static void main(String args[]) {
        int So = 1250080149;
        int Sodau = 0;
        int Socuoi = 0;
    
        Socuoi = Math.abs(So % 10);

        while (So != 0) {
            Sodau = Math.abs(So % 10);
          So /= 10;
        }
          
        System.out.println("The First digit of the given number is: " + Sodau);
        System.out.println("The Last digit of the given number is: " + Socuoi);
      }
    }