
package programnilaiakhir;
import java.util.*;
/**
 *
 * @author Galuh.Wicaksono
 */
public class ProgramNilaiAkhir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG NILAI AKHIR MATA KULIAH PBO UNDIRA");
        System.out.println();
        System.out.println();

        System.out.print("Mahasiswa Ke -  ");
        int jml = input.nextInt();

        String[] nama = new String[jml];
        double[] tugas = new double[jml];
        double[] uts = new double[jml];
        double[] uas = new double[jml];
        double[] akhir = new double[jml];
        char[] grade = new char[jml];

        for (int i = 0; i < jml; i++) {
            System.out.println("\nMahasiswa Ke - " + (i + 1));
            input.nextLine(); 
            System.out.print("Nama Mahasiswa : ");
            nama[i] = input.nextLine();
            System.out.print("Nilai Tugas    : ");
            tugas[i] = input.nextDouble();
            System.out.print("Nilai UTS      : ");
            uts[i] = input.nextDouble();
            System.out.print("Nilai UAS      : ");
            uas[i] = input.nextDouble();

            akhir[i] = (tugas[i] * 0.3) + (uts[i] * 0.3) + (uas[i] * 0.4);

            if (akhir[i] >= 80) {
                grade[i] = 'A';
            } else if (akhir[i] >= 70) {
                grade[i] = 'B';
            } else if (akhir[i] >= 59) {
                grade[i] = 'C';
            } else if (akhir[i] >= 50) {
                grade[i] = 'D';
            } else {
                grade[i] = 'E';
            }
        }

        System.out.println("\n\nDAFTAR NILAI");
        System.out.println("MATERI : PEMROGRAMMAN PBO");
        System.out.println("-----------------------------------------------------------");
        System.out.println("No.\tNama\t\tNilai\t\t\t\tGrade");
        System.out.println("\tMahasiswa\t------------------------------------");
        System.out.println("\t\t\tTugas\tUTS\tUAS\tAkhir");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < jml; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(nama[i] + "\t\t");
            System.out.print(tugas[i] + "\t");
            System.out.print(uts[i] + "\t");
            System.out.print(uas[i] + "\t");
            System.out.print(akhir[i] + "\t  ");
            System.out.println(grade[i]);
        }
        System.out.println("-----------------------------------------------------------");
    }
    
}
