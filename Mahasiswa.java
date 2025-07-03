package SDL.array;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String alamat;

    public Mahasiswa() {

    }

    public Mahasiswa(String nama, String nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public String getAlamat() {
        return alamat;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ", Prodi: " + prodi + ", Alamat: " + alamat;
    }

}
