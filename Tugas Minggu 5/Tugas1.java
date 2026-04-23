
package tugas1;


public class Tugas1 {


    public static void main(String[] args) {
         int a = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                a += i;
            }
        }
        System.out.println("2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 = " + a);
    }
    
}
