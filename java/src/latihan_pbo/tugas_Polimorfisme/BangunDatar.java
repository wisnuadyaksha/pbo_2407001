package latihan_pbo.tugas_Polimorfisme;

public class BangunDatar {
    private double varA;
    private double varB;

    // Constructor 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
    }

    // Getter
    public double getVarA() {
        return varA;
    }

    public double getVarB() {
        return varB;
    }

    // Default luas
    public double hitungLuas() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Luas: " + hitungLuas());
    }
}