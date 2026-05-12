package beratbadanideal;
import java.util.*;

public class BeratBadanIdeal {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Pilih jenis kelamin (L/P) : ");
        char Jkelamin = input.next().toUpperCase().charAt(0);
        System.out.print("Masukkan tinggi badan Anda (dalam cm) : ");
        int tinggi = input.nextInt();
        System.out.print("Berat badan ideal yang seharusnya : ");
        double sebenarnya = input.nextDouble();
        System.out.print("Masukan berat badan anda (dalam kg) : ");
        double Basli = input.nextDouble();
        
        int Bideal = 0;
        
        
        if (Jkelamin == 'L') {
            Bideal = tinggi - 100;}
        else if (Jkelamin == 'P') {
            Bideal = tinggi - 110;}
        else {
            System.out.print("Jenis Kelamin Salah Input");
                    }
       
        double selisih = sebenarnya - Bideal;

            if (Basli <= Bideal) {
                double kekurangan = Basli - sebenarnya;
                System.out.println("Anda termasuk dalam kategori Kurus dan harus menambah berat badan anda sebanyak " 
                        + kekurangan + " Kg (" + Basli + " Kg - " + sebenarnya + " Kg)");
            } else {
                System.out.println("Anda termasuk dalam kategori Gemuk dan harus mengurangi berat badan anda sebanyak " 
                        + selisih + " Kg (" + Basli + " Kg - " + sebenarnya + " Kg)");
            }
       
    }
    
}
