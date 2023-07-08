/*Kelompok 2 DPP 2KS2
Anggota kelompok:
1. Anna Adelia Dewanta    (222111904)
2. Kevin Ananda Puspita   (222112133)
3. Marsay Febriyanto      (222112177)
4. Nindy Nur Setiawati    (222112261)
5. Putri Sekar Ayu        (222112294)*/

package data;

import Data.validate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Form implements validate{
    private List<String> errorMessages;

    @Override
    public abstract boolean validasi();
    public abstract boolean save();
    public abstract void print() throws IOException;
    public abstract void reset();
    public List<String> getErrorMessages() {
        return errorMessages;
    };
    public void addErrorMessages(String e) {
        errorMessages.add(e);
    };

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }
}
