package project_uts;

public class matakuliah {
    private String namaRuangan;
    private String mataKuliah;
    private String namaKelas;
    private String kodeKelas;
    private String hari,jam;
  
  
    public matakuliah(String namaRuangan, String mataKuliah, String namaKelas, String kodeKelas, String hari,
            String jam) {
        this.namaRuangan = namaRuangan;
        this.mataKuliah = mataKuliah;
        this.namaKelas = namaKelas;
        this.kodeKelas = kodeKelas;
        this.hari = hari;
        this.jam = jam;
    }
    public String getNamaRuangan() {
        return namaRuangan;
    }
    public String getMataKuliah() {
        return mataKuliah;
    }
    public String getNamaKelas() {
        return namaKelas;
    }
    public String getKodeKelas() {
        return kodeKelas;
    }

    
    
}
