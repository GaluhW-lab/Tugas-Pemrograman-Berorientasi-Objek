package bentukx;
import java.util.*;

public class BentukX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
               for (int a = 0; a < 5; a++){
            for (int b = 0; b < 5; b++) {
                if (a == b || a + b == 5 - 1 ){
                    System.out.print("*");
                } else {
                System.out.print(" ");
                }
            }
                System.out.println();
        }
    }
    
}
