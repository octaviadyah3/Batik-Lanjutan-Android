package com.dyahexample.myloginapp.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface BatikDao {
    @Insert
    void insert(Batik batik);

    @Query("SELECT * FROM batik")
    List<Batik> getAllBatik();

}
