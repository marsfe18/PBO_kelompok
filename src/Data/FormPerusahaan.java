/*Kelompok 2 DPP 2KS2
Anggota kelompok:
1. Anna Adelia Dewanta    (222111904)
2. Kevin Ananda Puspita   (222112133)
3. Marsay Febriyanto      (222112177)
4. Nindy Nur Setiawati    (222112261)
5. Putri Sekar Ayu        (222112294)*/

package data;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FormPerusahaan extends Form{
    private String provinsi;
    private String Kabkota;
    private String periode;
    private List<Perusahaan> perusahaanList = new ArrayList<>();

    @Override
    public boolean validasi() {
//        return ValidasiForm.validasi(this);
        return true;
    }


    @Override
    public boolean save() {
        return false;
    }

    @Override
    public void print() throws IOException {
//        PrintForm.print(this);
    }

    public void remove() {
//        RemoveForm.remove(this);
    }

    @Override
    public void reset() {
        perusahaanList = new ArrayList<>();
    }

    public FormPerusahaan(String provinsi, String kabkota, String periode) {
        this.provinsi = provinsi;
        Kabkota = kabkota;
        this.periode = periode;
    }

    public List<Perusahaan> getPerusahaanList() {
        return perusahaanList;
    }
    public void addPerusahaanList(Perusahaan perusahaan) {
        perusahaanList.add(perusahaan);
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKabkota() {
        return Kabkota;
    }

    public void setKabkota(String kabkota) {
        Kabkota = kabkota;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public void setPerusahaanList(List<Perusahaan> perusahaanList) {
        this.perusahaanList = perusahaanList;
    }

    @Override
    public String toString() {
        return "Form[" + this.getProvinsi()+", "+this.getKabkota()+", "+this.getPeriode()+']';
    }
}
