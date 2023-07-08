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
    private Integer id;
    private Integer kodeprov;
    private Integer kodekab;
    private Integer period;
    private String provinsi;
    private String Kabkota;
    private String periode;
    private List<Perusahaan> perusahaanList = new ArrayList<>();


    public FormPerusahaan(Integer kodeprov, Integer kodekab, Integer period) {
        // BUAT BARU
        this.kodekab = kodekab;
        this.kodeprov = kodeprov;
        this.period = period;
        this.id = Integer.valueOf(kodeprov.toString()+kodekab.toString()+period.toString());
    }

    public List<Perusahaan> getPerusahaanList() {
        return perusahaanList;
    }
    public void addPerusahaanList(Perusahaan perusahaan) {
        perusahaanList.add(perusahaan);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer kodeprov, Integer kodekab, Integer period) {
        // SET ID FORM PERUSAHAAN JIKA INGIN SET SENDIRI
        this.kodekab = kodekab;
        this.kodeprov = kodeprov;
        this.period = period;
        this.id = Integer.valueOf(kodeprov.toString()+kodekab.toString()+period.toString());
    }

    public Integer getKodeprov() {
        return kodeprov;
    }

    public void setKodeprov(Integer kodeprov) {
        this.kodeprov = kodeprov;
    }

    public Integer getKodekab() {
        return kodekab;
    }

    public void setKodekab(Integer kodekab) {
        this.kodekab = kodekab;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
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
    
    public void addPerusahaan(Perusahaan perusahaan) {
        // JADI SAAT DI ADD KEDALAM FORM PERUSAHAAN OTOMATIS KEGENERATE ID PERUSAHAAN YAITU FORM ID + INDEKS
        perusahaan.setId(Integer.valueOf(this.id.toString() + String.valueOf(this.perusahaanList.size())));
        this.perusahaanList.add(perusahaan);
    }
    
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


    @Override
    public String toString() {
        return "Form[" + this.getProvinsi()+", "+this.getKabkota()+", "+this.getPeriode()+']';
    }
}
