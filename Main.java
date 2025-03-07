class Perusahaan {
    private final String namaPerusahaan;

    public Perusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
}

// Kelas Karyawan
class Karyawan {
    private String nama;
    private int gajiPokok;
    private Perusahaan perusahaan;

    public Karyawan(String nama, int gajiPokok, Perusahaan perusahaan) {
        setNama(nama);
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }

    public void setNama(String nama) {
        if (nama.length() >= 4) {
            this.nama = nama;
        } else {
            System.out.println ("Nama harus memiliki minimal 4 karakter.");
        }
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public void info() {
        System.out.println("Nama Karyawan  : " + nama);
        System.out.println("Gaji Pokok     : Rp" + gajiPokok);
        System.out.println("Perusahaan     : " + perusahaan.getNamaPerusahaan());
        System.out.println("-------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan1 = new Perusahaan("PT. Inovasi Teknologi");

        Karyawan karyawan1 = new Karyawan("Andi", 5000000, perusahaan1);
        Karyawan karyawan2 = new Karyawan("Budi", 6000000, perusahaan1);

        karyawan1.info();
        karyawan2.info();
    }
}