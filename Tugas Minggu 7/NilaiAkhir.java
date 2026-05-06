
package nilaiakhir;
import java.util.*;

public class NilaiAkhir {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG NILAI");
        System.out.println("AKHIR MATERI");
        System.out.println("PEMROGRAMAN C++");
        System.out.println();

        System.out.print("Mahasiswa Ke -  ");
        int banyakMhs = input.nextInt();
        
        System.out.println("Masukkan Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nilai Tugas    : ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS      : ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan Nilai UAS      : ");
        double nilaiUAS = input.nextDouble();

        double murniTugas = nilaiTugas * 0.30;
        double murniUTS = nilaiUTS * 0.30;
        double murniUAS = nilaiUAS * 0.40;

        double nilaiAkhir = murniTugas + murniUTS + murniUAS;

        String grade;
        if (nilaiAkhir >= 80) {
            grade = "A";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
        } else if (nilaiAkhir >= 59) {
            grade = "C";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("\n---------------------------------");
        System.out.println("Hasil Akhir Untuk Mahasiswa:");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Murni Tugas : " + murniTugas);
        System.out.println("Nilai Murni UTS   : " + murniUTS);
        System.out.println("Nilai Murni UAS   : " + murniUAS);
        System.out.println("---------------------------------");
        System.out.println("Nilai Akhir    : " + nilaiAkhir);
        System.out.println("Grade          : " + grade);
        System.out.println("---------------------------------");
    }
    
}
