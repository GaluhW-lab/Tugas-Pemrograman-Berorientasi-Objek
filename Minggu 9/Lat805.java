
package lat805;


public class Lat805 {
class Perhitungan extends Aritmatika
{
protected int z;
public Perhitungan(int z, int x, int y)
{
super(x, y);
this.z = z;
}
public int Hitung()
{
return z + super.kali();
}
public void hasil()
{
System.out.println("Nilai Z = " + this.z);
super.hasil();
}
}


    public static void main(String[] args) {
        Perhitungan matematika = new Perhitungan(5, 4, 3);
        matematika.hasil();
        System.out.println("Hasil Perhitungannya = " + matematika.Hitung());

    }
    
}
