package com.dyahexample.myloginapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Batik.class}, version = 1)
public abstract class BatikDatabase extends RoomDatabase {
    public abstract BatikDao batikDao();
}
