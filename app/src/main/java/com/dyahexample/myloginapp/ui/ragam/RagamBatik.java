package com.dyahexample.myloginapp.ui.ragam;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dyahexample.myloginapp.R;
import com.dyahexample.myloginapp.data.batik.BatikData;
import com.dyahexample.myloginapp.data.batik.BatikEntity;
import com.dyahexample.myloginapp.ui.adapter.BatikAdapter;
import com.dyahexample.myloginapp.ui.adapter.GridAdapter;

import java.util.ArrayList;

public class RagamBatik extends AppCompatActivity {
    private RecyclerView rvBatik;
    private ArrayList<BatikEntity>list = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ragambatikk);

        rvBatik = findViewById(R.id.rv_batik);
        rvBatik.setHasFixedSize(true);

        list.addAll(BatikData.getListBatik());
        showRecyclerList();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (rvBatik.getVisibility() == View.VISIBLE){
            outState.putBoolean("reply_visible",true);
        }
    }

    private void showRecyclerList(){
        rvBatik.setLayoutManager(new LinearLayoutManager(this));
        BatikAdapter batikAdapter = new BatikAdapter(list);
        rvBatik.setAdapter(batikAdapter);
    }


    private void showRecyclerGrid() {
        rvBatik.setLayoutManager(new GridLayoutManager(this,2 ));
        GridAdapter gridAdapter = new GridAdapter(list);
        rvBatik.setAdapter(gridAdapter);

    }
}