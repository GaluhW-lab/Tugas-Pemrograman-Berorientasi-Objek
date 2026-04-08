
package soal.pkg2;


public class Soal2 {


    public static void main(String[] args) {
        int a = 21;
        
        System.out.println("Nilai a = " +a);
        System.out.println("Nilai ++a = " + ++a);
        System.out.println("Nilai a++ = " + a++);
        System.out.println("Nilai a = " +a);
        
        a+=3;
        
        System.out.println("\n\nNilai a = " +a);
        System.out.println("Nilai ++a = " + ++a);
        System.out.println("Nilai a++ = " + a++);
        System.out.println("Nilai a-- = " + a--);
        System.out.println("Nilai a = " + --a);
                
        // posisi a-- diletakkan terlebih dahulu sebelum --a, karena jika tidak nilai akan tetap sama yaitu 27
    }
    
}
