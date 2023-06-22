package com.dyahexample.myloginapp.db;

import android.content.Context;

import androidx.room.Room;

import java.util.List;

public class BatikRepository {

    private String DB_NAME = "batik_db";
    private BatikDatabase batikDatabase;

    public BatikRepository(Context context) {
        batikDatabase = Room.databaseBuilder(context, BatikDatabase.class, DB_NAME).build();
    }

    public void insertBatik(Batik batik) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                batikDatabase.batikDao().insert(batik);
            }
        }).start();
    }

    public List<Batik> getAllBatik() {
        return batikDatabase.batikDao().getAllBatik();
    }


}
