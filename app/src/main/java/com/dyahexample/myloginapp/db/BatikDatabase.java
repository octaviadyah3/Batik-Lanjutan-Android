package com.dyahexample.myloginapp.db;

import androidx.room.Database;

@Database(entities = {Batik.class}, version = 1)
public abstract class BatikDatabase extends RoomDatabase {
    public abstract BatikDao batikDao();
}
