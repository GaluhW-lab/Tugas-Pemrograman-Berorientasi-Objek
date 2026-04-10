package soal3;
import java.util.*;

public class Soal3 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String nama, ukuran;
    int jbeli, total, Hsusu;
    Hsusu = 0;

                     
    System.out.println("TOKO KELONTONG KERONCONGAN");
    System.out.println("-----------------------------");
    System.out.println(" A. Susu Dancow");
    System.out.println("   A.1. Ukuran kecil");
    System.out.println("   A.2. Ukuran sedang");
    System.out.println("   A.3. Ukuran besar");
    System.out.println(" B. Susu Bendera");
    System.out.println("   B.1. Ukuran kecil");
    System.out.println("   B.2. Ukuran sedang");
    System.out.println("   B.3. Ukuran besar");
    System.out.println(" C. Susu SGM");
    System.out.println("   C.1. Ukuran kecil");
    System.out.println("   C.2. Ukuran sedang");
    System.out.println("   C.3. Ukuran besar");
    
    
    System.out.print("\nMasukkan Merk Susu [Dancow|Bendera|SGM] : ");
    nama = input.next();
    System.out.print("Masukkan Ukuran Kaleng [Kecil|Sedang|Besar] : ");
    ukuran = input.next();
    System.out.println("Harga satuan barang Rp. " +Hsusu);
    System.out.print("Jumlah yang dibeli : ");
    jbeli = input.nextInt();
    
    
    switch (nama) {
        case "dancow" :
            if ("ukuran".equals("kecil")){
                Hsusu = 25000;
            }
            else if ("ukuran".equals("sedang")){
                Hsusu = 20000;
            }
            else if ("ukuran".equals("besar")){
                Hsusu = 15000;
            }
            break;
            
        case "Bendera" :
            if ("ukuran".equals("Kecil")){
                Hsusu = 20000;
            }
            else if ("ukuran".equals("Sedang")){
                Hsusu = 17500;
            }
            else if ("ukuran".equals("Besar")){
                Hsusu = 13500;
            }
            break;    
            
        case "SGM" :
            if ("ukuran".equals("Kecil")){
                Hsusu = 22000;
            }
            else if ("ukuran".equals("Sedang")){
                Hsusu = 18500;
            }
            else if ("ukuran".equals("Besar")){
                Hsusu = 15000;
            }
            break;    
    }    
    
    total = jbeli * Hsusu;
            
    System.out.println("Harga yang harus dibayar sebesar Rp." +total);
    }
    
}
