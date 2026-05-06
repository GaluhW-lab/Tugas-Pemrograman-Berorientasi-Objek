
package gerobakfriedchicken;
import java.util.*;

public class GerobakFriedChicken {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("GEROBAK FRIED CHICKEN");
        System.out.println("---------------------");
        System.out.println("Kode Jenis   Harga");
        System.out.println("---------------------");
        System.out.println("D [Dada]    Rp. 2500");
        System.out.println("P [Paha]    Rp. 2000");
        System.out.println("S [Sayap]   Rp. 1500");
        System.out.println("---------------------");

        System.out.print("Banyak Jenis : ");
        int banyakJenis = input.nextInt();

        String[] jenisPotong = new String[banyakJenis];
        char[] kodePotong = new char[banyakJenis];
        int[] banyakBeli = new int[banyakJenis];
        int[] hargaSatuan = new int[banyakJenis];
        int[] jumlahHarga = new int[banyakJenis];

        for (int i = 0; i < banyakJenis; i++) {
            System.out.println("\nData Ke-" + (i + 1));
            System.out.print("Jenis Potong [D/P/S] : ");
            kodePotong[i] = input.next().toUpperCase().charAt(0);
            System.out.print("Banyak Beli          : ");
            banyakBeli[i] = input.nextInt();

            switch (kodePotong[i]) {
                case 'D':
                    jenisPotong[i] = "Dada";
                    hargaSatuan[i] = 2500;
                    break;
                case 'P':
                    jenisPotong[i] = "Paha";
                    hargaSatuan[i] = 2000;
                    break;
                case 'S':
                    jenisPotong[i] = "Sayap";
                    hargaSatuan[i] = 1500;
                    break;
                default:
                    jenisPotong[i] = "Unknown";
                    hargaSatuan[i] = 0;
                    break;
            }
            jumlahHarga[i] = hargaSatuan[i] * banyakBeli[i];
        }


        System.out.println("\n\nGEROBAK FRIED CHICKEN");
        System.out.println("---------------------------------------------------------------");
        System.out.println("No   Jenis       Harga       Banyak      Jumlah");
        System.out.println("     Potong      Satuan      Beli        Harga");
        System.out.println("---------------------------------------------------------------");

        int totalBayar = 0;
        for (int i = 0; i < banyakJenis; i++) {
            System.out.printf("%-4d %-11s Rp.%-9d %-11d Rp.%-10d\n", 
                (i + 1), jenisPotong[i], hargaSatuan[i], banyakBeli[i], jumlahHarga[i]);
            totalBayar += jumlahHarga[i];
        }

        double pajak = totalBayar * 0.10;
        double totalSeluruhnya = totalBayar + pajak;

        System.out.println("---------------------------------------------------------------");
        System.out.printf("\t\t\tJumlah Bayar   Rp. %.0f\n", (double)totalBayar);
        System.out.printf("\t\t\tPajak 10%%      Rp. %.0f\n", pajak);
        System.out.printf("\t\t\tTotal Bayar    Rp. %.0f\n", totalSeluruhnya);
    }
    
}
