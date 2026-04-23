
package tugas4;
import java.util.*;

public class Tugas4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 20;
        System.out.println("Bilangan prima :  ");

        for (int n = 2; n <= a; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
}
