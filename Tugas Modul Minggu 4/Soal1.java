
package soal1;
import java.util.*;

public class Soal1 {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    
    String nsiswa, hadiah1;
    int nilai1, nilai2, nilai3, nrata, nrata2;
    
    System.out.print("Nama Siswa : ");
    nsiswa = input.next();
    System.out.print("Nama Pertandingan I : ");
    nilai1 = input.nextInt();
    System.out.print("Nama Pertandingan II : ");
    nilai2 = input.nextInt();
    System.out.print("Nama Pertandingan III : ");
    nilai3 = input.nextInt();
    
    nrata = nilai1 + nilai2 + nilai3;
    nrata2 = nrata / 3;
    
    if (nrata2 >= 0 && nrata2 <= 70)
    {
        hadiah1 = "hiburan";
    }
    
    else if (nrata2 >= 85)
    {
        hadiah1 = "Komputer P4";
    }
    else
    {    
        hadiah1 = "uang sebesar Rp 500.000";
    }

    System.out.println("Siswa yang bernama : " +nsiswa);
    System.out.print("Memperoleh nilai rata-rata " +nrata2);
    System.out.println(" dan hasil perlombaan yang diikutinya dan berhak mendapatkan hadiah " +hadiah1);
    
    }
    
}
