package latihan_pbo.latihan2;

class Cafe {
    String nama;
    String alamat;

    // Constructor
    Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;

        System.out.println("Nama Cafenya adalah = " + nama);
        System.out.println("Alamatnya di = " + alamat);
    }

    // Method
    void buka() {
        System.out.println("Cafe Sudah Buka");
    }
}

public class main {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("Halaman", "Indramayu");
        cafe1.buka();

        System.out.println();

        Cafe cafe2 = new Cafe("Teringat", "Indramayu");
        cafe2.buka();

        System.out.println();

        Cafe cafe3 = new Cafe("KopKen", "Indramayu");
        cafe3.buka();
    }
}
