/*Kelompok 2 DPP 2KS2
Anggota kelompok:
1. Anna Adelia Dewanta    (222111904)
2. Kevin Ananda Puspita   (222112133)
3. Marsay Febriyanto      (222112177)
4. Nindy Nur Setiawati    (222112261)
5. Putri Sekar Ayu        (222112294)*/

package data;

import Data.Field.Identitas;
import Data.Field.PencacahanDPP;
import Data.Field.Subsektor;

public class Perusahaan {
    private Identitas identitasPerusahaan2_6;
    private PencacahanDPP pencacahanDPP;
    private Subsektor subsektor;
    private String jenisUsahaUtama20;

    public Perusahaan(Identitas identitasPerusahaan2_6, PencacahanDPP pencacahanDPP, Subsektor subsektor, String jenisUsahaUtama20) {
        this.identitasPerusahaan2_6 = identitasPerusahaan2_6;
        this.pencacahanDPP = pencacahanDPP;
        this.subsektor = subsektor;
        this.jenisUsahaUtama20 = jenisUsahaUtama20;
    }

    public Identitas getIdentitasPerusahaan2_6() {
        return identitasPerusahaan2_6;
    }

    public void setIdentitasPerusahaan2_6(Identitas identitasPerusahaan2_6) {
        this.identitasPerusahaan2_6 = identitasPerusahaan2_6;
    }

    public PencacahanDPP getPencacahanDPP() {
        return pencacahanDPP;
    }

    public void setPencacahanDPP(PencacahanDPP pencacahanDPP) {
        this.pencacahanDPP = pencacahanDPP;
    }

    public Subsektor getSubsektor() {
        return subsektor;
    }

    public void setSubsektor(Subsektor subsektor) {
        this.subsektor = subsektor;
    }

    public String getJenisUsahaUtama20() {
        return jenisUsahaUtama20;
    }

    public void setJenisUsahaUtama20(String jenisUsahaUtama20) {
        jenisUsahaUtama20 = jenisUsahaUtama20;
    }
    public boolean isF20Valid() throws Exception {
        if (!jenisUsahaUtama20.matches("[1-2]|3[abcdefghijk]|[4-6]|7[abcdef]|8|9|10|11|")) {
            throw new Exception("kolom 20 invalid");
        }
        return true;
    }
}
