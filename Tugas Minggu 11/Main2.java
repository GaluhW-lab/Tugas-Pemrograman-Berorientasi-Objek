import bangundatar.BangunDatar;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM HITUNG LINGKARAN ===");
        System.out.print("Masukkan nilai radius (jari-jari): ");
      
        double radius = input.nextDouble();

        double luas = Lingkaran.hitungLuas(radius);
        double keliling = Lingkaran.hitungKeliling(radius);

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.printf("Luas Lingkaran     : %.2f\n", luas);
        System.out.printf("Keliling Lingkaran : %.2f\n", keliling);

        input.close();
    }
}