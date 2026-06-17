import bangundatar.Lingkaran;
import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("=== PROGRAM HITUNG LINGKARAN ===");
      System.out.print("Masukkan nilai radius (jari-jari): ");
      double var2 = var1.nextDouble();
      double var4 = Lingkaran.hitungLuas(var2);
      double var6 = Lingkaran.hitungKeliling(var2);
      System.out.println("\n--- Hasil Perhitungan ---");
      System.out.printf("Luas Lingkaran     : %.2f\n", var4);
      System.out.printf("Keliling Lingkaran : %.2f\n", var6);
      var1.close();
   }
}