/*Kelompok 2 DPP 2KS2
Anggota kelompok:
1. Anna Adelia Dewanta    (222111904)
2. Kevin Ananda Puspita   (222112133)
3. Marsay Febriyanto      (222112177)
4. Nindy Nur Setiawati    (222112261)
5. Putri Sekar Ayu        (222112294)*/

package Data.Field;

public class Subsektor {
    private byte tanamanPangan14;
    private byte horikultura15;
    private String perkebunan16;
    private byte peternakan17;
    private byte kehutanan18;
    private byte perikanan19;

    public Subsektor(byte tanamanPangan14, byte horikultura15, String perkebunan16, byte peternakan17, byte kehutanan18, byte perikanan19) {
        this.tanamanPangan14 = tanamanPangan14;
        this.horikultura15 = horikultura15;
        this.perkebunan16 = perkebunan16;
        this.peternakan17 = peternakan17;
        this.kehutanan18 = kehutanan18;
        this.perikanan19 = perikanan19;
    }

    public Subsektor() {
    }

    public byte getTanamanPangan14() {
        return tanamanPangan14;
    }

    public void setTanamanPangan14(byte tanamanPangan14) {
        this.tanamanPangan14 = tanamanPangan14;
    }

    public byte getHorikultura15() {
        return horikultura15;
    }

    public void setHorikultura15(byte horikultura15) {
        this.horikultura15 = horikultura15;
    }

    public String getPerkebunan16() {
        return perkebunan16;
    }

    public void setPerkebunan16(String perkebunan16) {
        this.perkebunan16 = perkebunan16;
    }

    public byte getPeternakan17() {
        return peternakan17;
    }

    public void setPeternakan17(byte peternakan17) {
        this.peternakan17 = peternakan17;
    }

    public byte getKehutanan18() {
        return kehutanan18;
    }

    public void setKehutanan18(byte kehutanan18) {
        this.kehutanan18 = kehutanan18;
    }

    public byte getPerikanan19() {
        return perikanan19;
    }

    public void setPerikanan19(byte perikanan19) {
        this.perikanan19 = perikanan19;
    }

    public static void validBool(byte a, int b) throws Exception {
        if (!(a == 0 || a == 1)) {
            throw new Exception(String.format("kolom %d invalid",b));
        }
    }

    public boolean isF14Valid() throws Exception {
        validBool(tanamanPangan14,14);
        return true;

    }

    public boolean isF15Valid() throws Exception {
        validBool(horikultura15,15);
        return true;
    }

    public boolean isF16Valid() throws Exception{
        if (!perkebunan16.matches("0|3[abcdefghijk]")) {
            throw new Exception("kolom 16 invalid");
        }
        return true;
    }

    public boolean isF17Valid() throws Exception{
        validBool(peternakan17,17);
        return true;
    }
    public boolean isF18Valid() throws Exception {
        validBool(kehutanan18,18);
        return true;
    }
    public boolean isF19Valid() throws Exception {
        validBool(perikanan19,19);
        return true;
    }

}
