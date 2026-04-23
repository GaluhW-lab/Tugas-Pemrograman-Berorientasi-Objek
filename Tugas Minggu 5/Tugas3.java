
package tugas3;


public class Tugas3 {


    public static void main(String[] args) {
        int n = 8;
        int t1 = 1, t2 = 1;

        System.out.print(" Deret Fibonacci: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
    
}
