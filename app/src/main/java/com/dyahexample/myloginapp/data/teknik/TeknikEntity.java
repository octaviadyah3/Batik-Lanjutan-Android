package com.dyahexample.myloginapp.data.teknik;

import android.os.Parcel;
import android.os.Parcelable;

import com.dyahexample.myloginapp.data.batik.BatikEntity;

    public class TeknikEntity implements Parcelable {
        private String teknikBatik;
        private String teknikDeskripsi;

        protected TeknikEntity(Parcel in) {
            teknikBatik = in.readString();
            teknikDeskripsi = in.readString();
        }

        public static final Creator<TeknikEntity> CREATOR = new Creator<TeknikEntity>() {
            @Override
            public TeknikEntity createFromParcel(Parcel in) {
                return new TeknikEntity(in);
            }

            @Override
            public TeknikEntity[] newArray(int size) {
                return new TeknikEntity[size];
            }
        };

        public TeknikEntity() {

        }

        public String getTeknikBatik() {return teknikBatik; }
        public void setTeknikBatik(String batikName) {this.teknikBatik = teknikBatik; }

        public String getTeknikDeskripsi() {return teknikDeskripsi; }
        public void setTeknikDeskripsi(String teknikDeskripsi) {this.teknikDeskripsi = teknikDeskripsi;}

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(teknikBatik);
            parcel.writeString(teknikDeskripsi);
        }
    }


