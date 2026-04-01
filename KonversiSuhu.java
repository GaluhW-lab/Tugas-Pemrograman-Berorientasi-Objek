package konversisuhu;
import java.util.Scanner;

public class KonversiSuhu {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int cel;
        double fah, ream;
      
        
        System.out.print("Masukan Nilai Derajat Celcius : ");
        cel = input.nextInt();
        
        fah = (9.0/5.0 * cel) + 32;
        ream = cel * (4.0/5.0);
        
        System.out.println("Hasil Konversi :");
        System.out.println("Derajat Farenheit : " +fah);
        System.out.println("Derajat Reamor : " +ream);
    }
    
}
