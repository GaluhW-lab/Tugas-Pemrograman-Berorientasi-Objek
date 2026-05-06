package angkaterbesar;
import java.util.*;

public class AngkaTerbesar {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah angka harus lebih dari 0 ");} 
        else {
            int[] daftarAngka = new int[jumlah];

            for (int i = 0; i < jumlah; i++) {
                System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
                daftarAngka[i] = input.nextInt();}

            int hasil = cariMaksimal(daftarAngka);

            System.out.println("--------------------------------");
            System.out.println("Angka terbesar yang ditemukan adalah: " + hasil);
        }
    }

    public static int cariMaksimal(int[] angkaArray) {
   
        int terbesar = angkaArray[0];

        for (int i = 1; i < angkaArray.length; i++) {
            if (angkaArray[i] > terbesar) {
                terbesar = angkaArray[i]; 
            }
        }
        return terbesar;
    }
    
}
