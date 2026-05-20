
package lat804;

class Hitungan extends Matematika { 

private int x, y; 


public Hitungan() 
{ 
x = 1; 

y = 2; 
} 

public Hitungan(int i, int j) 

{ 
x = i; 
y = j; 

} 


public int tambah() 
{ 
	return x + y; 

} 


public int kali() 
{ 
	return y * 3; 

} 
}

public class Lat804 {

    
    public static void main(String[] args) {
        Hitungan ngitung = new Hitungan(5, 6);
        System.out.println(" Hasil Pertambahannya = " + ngitung.tambah());
        System.out.println(" Hasil Perkaliannya = " + ngitung.kali());
    }
    
}
