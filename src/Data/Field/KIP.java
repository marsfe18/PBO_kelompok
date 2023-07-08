/*Kelompok 2 DPP 2KS2
Anggota kelompok:
1. Anna Adelia Dewanta    (222111904)
2. Kevin Ananda Puspita   (222112133)
3. Marsay Febriyanto      (222112177)
4. Nindy Nur Setiawati    (222112261)
5. Putri Sekar Ayu        (222112294)*/

package Data.Field;

public class KIP {
    private byte kodeProv2;
    private int kodeKab3;
    private int kodeKec4;
    private int kodeKJU5;
    private Integer nomorUrut6;

    public KIP() {
    }

    public KIP(byte kodeProv2, int kodeKab3, int kodeKec4, int kodeKJU5, Integer nomorUrut6) {
        this.kodeProv2 = kodeProv2;
        this.kodeKab3 = kodeKab3;
        this.kodeKec4 = kodeKec4;
        this.kodeKJU5 = kodeKJU5;
        this.nomorUrut6 = nomorUrut6;
    }

    public byte getKodeProv2() {
        return kodeProv2;
    }

    public void setKodeProv2(byte kodeProv2) {
        this.kodeProv2 = kodeProv2;
    }

    public int getKodeKab3() {
        return kodeKab3;
    }

    public void setKodeKab3(byte kodeKab3) {
        this.kodeKab3 = kodeKab3;
    }

    public int getKodeKec4() {
        return kodeKec4;
    }

    public void setKodeKec4(byte kodeKec4) {
        this.kodeKec4 = kodeKec4;
    }

    public int getKodeKJU5() {
        return kodeKJU5;
    }

    public void setKodeKJU5(byte kodeKJU5) {
        this.kodeKJU5 = kodeKJU5;
    }

    public Integer getNomorUrut6() {
        return nomorUrut6;
    }

    public void setNomorUrut6(Integer nomorUrut6) {
        this.nomorUrut6 = nomorUrut6;
    }
}
