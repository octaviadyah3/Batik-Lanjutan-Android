package com.dyahexample.myloginapp.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "batik")
public class Batik {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nama;
    private String teknik;

    public Batik(String nama, String teknik) {
        this.nama = nama;
        this.teknik = teknik;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTeknik() {
        return teknik;
    }

    public void setTeknik(String teknik) {
        this.teknik = teknik;
    }

}
