package com.dyahexample.myloginapp.data.batik;

import android.os.Parcel;
import android.os.Parcelable;

public class BatikEntity implements Parcelable {
    private String name;
    private String deskripsi;
    private int gambar;
    private String asal;

    protected BatikEntity(Parcel in) {
        name = in.readString();
        deskripsi = in.readString();
        gambar = in.readInt();
        asal = in.readString();
    }

    public static final Creator<BatikEntity> CREATOR = new Creator<BatikEntity>() {
        @Override
        public BatikEntity createFromParcel(Parcel in) {
            return new BatikEntity(in);
        }

        @Override
        public BatikEntity[] newArray(int size) {
            return new BatikEntity[size];
        }
    };

    public BatikEntity() {

    }

    public String getName() {return name; }
    public void setName(String batikName) {this.name = batikName; }

    public String getDeskripsi() {return deskripsi; }
    public void setDeskripsi(String batikDeskripsi) {this.deskripsi = batikDeskripsi;}

    public int getGambar() {
        return gambar;
    }
    public void setGambar(int batikGambar) {this.gambar = batikGambar; }

    public String getBatik() {return asal; }
    public void setBatik(String asalBatik) {this.asal = asalBatik; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(deskripsi);
        parcel.writeInt(gambar);
        parcel.writeString(asal);
    }
}
