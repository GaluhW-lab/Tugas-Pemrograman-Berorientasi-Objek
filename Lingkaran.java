
package lingkaran;
import java.util.Scanner;

public class Lingkaran {


    public static void main(String[] args) {
       Scanner Lingkaran = new Scanner(System.in);
       
       int r, d;
       double luas, kel, pi;
       
       System.out.print("Masukan Nilai Radius : ");
       r = Lingkaran.nextInt();
       
       pi = 3.14;
       d = 2 * r;
       luas = pi * (r * r);
       kel = pi * d;
       
       System.out.println("Hasil Perhitungan : ");
       System.out.println("Luas Lingkaran :" +luas);
       System.out.println("Keliling Lingkaran :" +kel);
    }
    
}
