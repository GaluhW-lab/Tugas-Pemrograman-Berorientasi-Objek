package soal2;
import java.util.Scanner;

public class Soal2 {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    String nsiswa, grade;
    int naktif, ntugas, nujian;
    double nMaktif, nMtugas, nMujian, nAkhir;
    
    System.out.print("Nama Siswa : ");
    nsiswa = input.next();
    System.out.print("Nilai Keaktifan : ");
    naktif = input.nextInt();
    System.out.print("Nilai Tugas : ");
    ntugas = input.nextInt();
    System.out.print("Nilai Ujian : ");
    nujian = input.nextInt();
    
    nMaktif = naktif * 0.2;
    nMtugas = ntugas * 0.3;
    nMujian = nujian * 0.5;
    nAkhir = nMaktif + nMtugas + nMujian;
    
    if (nAkhir >= 0 && nAkhir < 50)
    { 
        grade = "E"; 
    }
    else if (nAkhir >= 80)
    { 
        grade = "A";
    }
    else if (nAkhir >= 70)
    { 
        grade = "B";
    }        
    else if (nAkhir >= 59)
    { 
        grade = "C";
    }        
    else
    { 
        grade = "D";
    }        
    
    System.out.print("Siswa yang bernama : " +nsiswa);
    System.out.println("Dengan Nilai Persentasi Yang Dihasilkan");
    System.out.println("Nilai Keaktifan : " +nMaktif);
    System.out.println("Nilai Tugas : " +nMtugas);
    System.out.println("Nilai Ujian : " +nMujian);
    System.out.print("Jadi siswa yang bernama " +nsiswa);
    System.out.println(" memperoleh nilai akhir sebesar " +nAkhir);
    System.out.println("Grade Nilai yang didapat adalah " +grade);
    }
    
}
