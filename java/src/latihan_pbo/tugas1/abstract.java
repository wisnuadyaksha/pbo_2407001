package latihan_pbo.tugas1;

public abstract class BangunDatar {
    private String nama;

    public BangunDatar (String nama){
        this.nama = nama;
    }

    // abstract method
    abstract double hitungLuas();

    // BUAT SATU ABSTRACT METHOD DENGAN NAMA hitungKeliling
    abstract double hitungKeliling();

    public void Display(){
        System.out.println("Ini adalah: " + nama);
    }
}
