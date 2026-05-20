
package jenisbinatang;


public class JenisBinatang {

class jenisBinatang extends Binatang {
String jenisBinatang;
jenisBinatang(String jenisBinatang){
super(jenisBinatang);
}

public void cetakjenis(){
super.cetakjenis();
jenisBinatang="Predator";
System.out.println("Jenis Binatang : " + jenisBinatang);
}
}

    public static void main(String[] args) {
       
    }
    
}
