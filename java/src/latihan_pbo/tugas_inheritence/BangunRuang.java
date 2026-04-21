package latihan_pbo.tugas_inheritence;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    // Constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // ambil dari parent
        this.tinggi = tinggi;
    }

    // Method hitung volume
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}