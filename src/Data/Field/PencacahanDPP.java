/*Kelompok 2 DPP 2KS2
Anggota kelompok:
1. Anna Adelia Dewanta    (222111904)
2. Kevin Ananda Puspita   (222112133)
3. Marsay Febriyanto      (222112177)
4. Nindy Nur Setiawati    (222112261)
5. Putri Sekar Ayu        (222112294)*/

package Data.Field;

public class PencacahanDPP {
    private byte statusKunjungan12;
    private byte statusPerusahaan13;

    public PencacahanDPP(byte statusKunjungan12, byte statusPerusahaan13) {
        this.statusKunjungan12 = statusKunjungan12;
        this.statusPerusahaan13 = statusPerusahaan13;
    }

    public PencacahanDPP() {
    }

    public byte getStatusKunjungan12() {
        return statusKunjungan12;
    }

    public void setStatusKunjungan12(byte statusKunjungan12) {
        this.statusKunjungan12 = statusKunjungan12;
    }

    public byte getStatusPerusahaan13() {
        return statusPerusahaan13;
    }

    public void setStatusPerusahaan13(byte statusPerusahaan13) {
        this.statusPerusahaan13 = statusPerusahaan13;
    }

    public boolean isF12Valid() throws Exception{
        if (!(statusKunjungan12==0 || statusKunjungan12==1)) {
            throw new Exception("kolom 12 invalid");
        }
        return true;
    }
    public boolean isF13Valid() throws Exception{
        if (statusPerusahaan13<1 || statusPerusahaan13>9) {
            throw new Exception("kolom 13 invalid");
        }
        return true;
    }
}
