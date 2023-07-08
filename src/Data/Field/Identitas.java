/*Kelompok 2 DPP 2KS2
Anggota kelompok:
1. Anna Adelia Dewanta    (222111904)
2. Kevin Ananda Puspita   (222112133)
3. Marsay Febriyanto      (222112177)
4. Nindy Nur Setiawati    (222112261)
5. Putri Sekar Ayu        (222112294)*/

package Data.Field;

public class Identitas {
    private KIP kodeIdentitasPerusahaan2_6;
    private String namaPerusahaan7;
    private String alamatPerusahaan8;
    private String nomorTelepon9;
    private String faksimili10;
    private byte bentukBadanHukum11;

    public Identitas(KIP kodeIdentitasPerusahaan2_6, String namaPerusahaan7, String alamatPerusahaan8, String nomorTelepon9, String faksimili10, byte bentukBadanHukum11) {
        this.kodeIdentitasPerusahaan2_6 = kodeIdentitasPerusahaan2_6;
        this.namaPerusahaan7 = namaPerusahaan7;
        this.alamatPerusahaan8 = alamatPerusahaan8;
        this.nomorTelepon9 = nomorTelepon9;
        this.faksimili10 = faksimili10;
        this.bentukBadanHukum11 = bentukBadanHukum11;
    }

    public Identitas() {
    }

    public KIP getKodeIdentitasPerusahaan2_6() {
        return kodeIdentitasPerusahaan2_6;
    }

    public void setKodeIdentitasPerusahaan2_6(KIP kodeIdentitasPerusahaan2_6) {
        this.kodeIdentitasPerusahaan2_6 = kodeIdentitasPerusahaan2_6;
    }

    public String getNamaPerusahaan7() {
        return namaPerusahaan7;
    }

    public void setNamaPerusahaan7(String namaPerusahaan7) {
        this.namaPerusahaan7 = namaPerusahaan7;
    }

    public String getAlamatPerusahaan8() {
        return alamatPerusahaan8;
    }

    public void setAlamatPerusahaan8(String alamatPerusahaan8) {
        this.alamatPerusahaan8 = alamatPerusahaan8;
    }

    public String getNomorTelepon9() {
        return nomorTelepon9;
    }

    public void setNomorTelepon9(String nomorTelepon9) {
        this.nomorTelepon9 = nomorTelepon9;
    }

    public String getFaksimili10() {
        return faksimili10;
    }

    public void setFaksimili10(String faksimili10) {
        this.faksimili10 = faksimili10;
    }

    public byte getBentukBadanHukum11() {
        return bentukBadanHukum11;
    }

    public void setBentukBadanHukum11(byte bentukBadanHukum11) {
        this.bentukBadanHukum11 = bentukBadanHukum11;
    }

    public boolean isf11Valid() throws Exception{
        if (bentukBadanHukum11 < 1 || bentukBadanHukum11 > 10) {
            throw new Exception("kolom 11 invalid");
        }
        return true;
    }
}
