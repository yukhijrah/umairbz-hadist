package decloudius.app.kumpulanhadits.model;

import java.io.Serializable;

/**
 * Created by Rosyid on 10/8/2018.
 */

public class Doa implements Serializable{

    private String nama;
    private String arti;
    private String surah;

    public Doa(String nama, String arti, String surah) {
        this.nama = nama;
        this.arti = arti;
        this.surah = surah;
    }

    public String getNama() {
        return nama;
    }

    public String getArti() {
        return arti;
    }

    public String getSurah() {
        return surah;
    }
}
