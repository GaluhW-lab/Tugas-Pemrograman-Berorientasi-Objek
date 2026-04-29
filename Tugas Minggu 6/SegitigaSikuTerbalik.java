package segitigasikuterbalik;
import java.util.*;

public class SegitigaSikuTerbalik {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
                       for (int a = 1; a <= 5; a++){
            for (int b = 1; b <= 5; b++){
                System.out.print(" ");
                }
                for (int c = 1; c <= 6 - a; c++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
    
}
