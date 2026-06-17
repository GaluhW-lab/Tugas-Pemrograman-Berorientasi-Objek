package akademik;

public class HitungNilai {


    public static double kalkulasiNilaiAkhir(double tugas, double quis, double ujian) {
        double nilaiMurniTugas = 0.25 * tugas;
        double nilaiMurniQuis  = 0.30 * quis;
        double nilaiMurniUjian = 0.45 * ujian;

        return nilaiMurniTugas + nilaiMurniQuis + nilaiMurniUjian;
    }
}