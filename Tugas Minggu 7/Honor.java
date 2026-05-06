package honor;
import java.util.*;

public class Honor {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Hitung Honor Karyawan");
        System.out.println("Kontrak PT. EASY");
        System.out.print("Masukkan Jumlah Karyawan : ");
        int jml = input.nextInt();

        String[] nama = new String[jml];
        int[] golongan = new int[jml];
        int[] pendidikan = new int[jml];
        int[] jamKerja = new int[jml];
        
        double honorTetap = 700000;
        double totalGajiKeseluruhan = 0;

        for (int i = 0; i < jml; i++) {
            System.out.println("\nKaryawan Ke - " + (i + 1));
            input.nextLine(); 
            System.out.print("Nama Karyawan                  : ");
            nama[i] = input.nextLine();
            System.out.print("Golongan (1/2/3)               : ");
            golongan[i] = input.nextInt();
            System.out.print("Pendidikan (1=SMU/2=D3/3=S1)   : ");
            pendidikan[i] = input.nextInt();
            System.out.print("Jumlah Jam Kerja               : ");
            jamKerja[i] = input.nextInt();
        }

        System.out.println("\nPT. EASY");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("No.  Nama            Tunjangan                                       Gaji");
        System.out.println("     Karyawan        ----------------      Honor     Pajak           Bersih");
        System.out.println("                     Jabatan    Pdidikan   Lembur");
        System.out.println("----------------------------------------------------------------------------------");

        for (int i = 0; i < jml; i++) {
            double persentaseJabatan = 0;
            if (golongan[i] == 1) persentaseJabatan = 0.05;
            else if (golongan[i] == 2) persentaseJabatan = 0.10;
            else if (golongan[i] == 3) persentaseJabatan = 0.15;
            double tunjJabatan = persentaseJabatan * honorTetap;

            double persentasePdd = 0;
            if (pendidikan[i] == 1) persentasePdd = 0.025;
            else if (pendidikan[i] == 2) persentasePdd = 0.05;
            else if (pendidikan[i] == 3) persentasePdd = 0.075;
            double tunjPendidikan = persentasePdd * honorTetap;

            double honorLembur = 0;
            if (jamKerja[i] > 240) {
                honorLembur = (jamKerja[i] - 240) * 2500;
            }

            double totalPenghasilan = honorTetap + tunjJabatan + tunjPendidikan + honorLembur;
            double pajak = 0.1 * totalPenghasilan; 
            double gajiBersih = totalPenghasilan - pajak;
            
            totalGajiKeseluruhan += gajiBersih;

            System.out.printf("%-4d %-15s %-10.0f %-10.0f %-10.0f %-10.0f %.0f\n", 
                (i + 1), nama[i], tunjJabatan, tunjPendidikan, honorLembur, pajak, gajiBersih);
        }

        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("Total Gaji yang dikeluarkan Rp. %.0f\n", totalGajiKeseluruhan);
    }
    
}
