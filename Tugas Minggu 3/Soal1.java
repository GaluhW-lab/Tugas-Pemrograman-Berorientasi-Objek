package soal.pkg1;
import java.util.Scanner;

public class Soal1 {


    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     int a, b, c, k, l, m;
     boolean d, e, f, g;
     
     a = 3;
     b = 6;      
     c = 2;
     k = 5;
     l = 4;
     m = 3;
     
     d = 4 + 2 > a;
     e = b - 2 > 3 + 2;
     f = b + 2 <= 6 + 2;
     g = d && e || f;
     
     System.out.println("Hasil dari d adalah " +d);
     System.out.println("Hasil dari e adalah " +e);
     System.out.println("Hasil dari f adalah " +f);
     System.out.println("Hasil dari g = d && e adalah  " +g);
     
    // D = (4 + 2 > A && B – 2 > 3 + 2 || B + 2 <= 6 + 2) hasilnya TRUE
    // = K + 5 < M || (C * M < L && 2 * M – L > 0) hasilnya FALSE      
    // = L + 5 < M || C * K < L && 2 * K – L > 0 hasilnya FALSE
    // = A * 4 <= 3 * M + B hasilnya TRUE
    // = K + 10 > A && L – 2 > 4 * C hasilnya FALSE
    }
    
}


