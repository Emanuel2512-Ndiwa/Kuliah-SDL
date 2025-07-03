package project_uts;

import java.util.List;

public class dosen {
    private String namadosen;
    private int kodeDosen;
    private List<matakuliah> daftar;
    
    public dosen(String namadosen, int kodeDosen, List<matakuliah> daftar) {
        this.namadosen = namadosen;
        this.kodeDosen = kodeDosen;
        this.daftar = daftar;
    }
    public String getNamadosen() {
        return namadosen;
    }
    public int getKodeDosen() {
        return kodeDosen;
    }
   
   
   

    
    
    
}
