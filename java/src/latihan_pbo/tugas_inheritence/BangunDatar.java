package latihan_pbo.tugas_inheritence;

public class BangunDatar {
    private double panjang;
    private double lebar;

    // Constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter (opsional tapi bagus untuk enkapsulasi)
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // Method hitung luas
    public double hitungLuas() {
        return panjang * lebar;
    } 
}
