package segitigakanan;
import java.util.*;

public class SegitigaKanan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (int a = 5 - 1; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
