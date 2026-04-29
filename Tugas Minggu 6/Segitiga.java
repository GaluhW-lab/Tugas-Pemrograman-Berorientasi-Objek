package segitiga;
import java.util.*;

public class Segitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int a = 1; a <= 5; a++){
            for (int b = 1; b <= 5 - a; b++){
                System.out.print(" ");
                }
                for (int c = 1; c <= a; c++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
    
}
