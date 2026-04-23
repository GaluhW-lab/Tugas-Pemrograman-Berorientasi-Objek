
package tugas2;


public class Tugas2 {


    public static void main(String[] args) {
         int a = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                a += i;
            }
        }
        System.out.println("1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19 = " + a);
    }
    
}
