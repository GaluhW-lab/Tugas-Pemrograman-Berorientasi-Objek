
package nilaiakhir;
import java.util.Scanner;

public class NilaiAkhir {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        int UTS, UAS, Tugas;
        double mUTS, mUAS, mTugas, nAkhir;
        
        System.out.print("Masukan Nama Mahasiswa : ");
        nama = input.nextLine();
        System.out.print("Nilai UTS : ");
        UTS = input.nextInt();
        System.out.print("Nilai UAS : ");
        UAS = input.nextInt();
        System.out.print("Nilai Tugas Mandiri : ");
        Tugas = input.nextInt();
        System.out.println();
        
        mUTS = UTS * 0.35;
        mUAS = UAS * 0.45;
        mTugas = Tugas * 0.2;
        nAkhir = mUTS + mUAS + mTugas;
        
        System.out.println("Nilai Murni yang diperoleh : ");
        System.out.println("Nilai Murni UTS : " +mUTS);
        System.out.println("Nilai Murni UAS : " +mUAS);
        System.out.println("Nilai Murni Tugas : " +mTugas);
        System.out.println("Nilai Akhir yang diperoleh yaitu : " +nAkhir);
    }
    
}
