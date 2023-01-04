package com.dyahexample.myloginapp.ui.teknik;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.dyahexample.myloginapp.R;
import com.dyahexample.myloginapp.data.batik.BatikData;
import com.dyahexample.myloginapp.data.teknik.TeknikBatik;
import com.dyahexample.myloginapp.data.teknik.TeknikEntity;
import com.dyahexample.myloginapp.ui.adapter.BatikAdapter;
import com.dyahexample.myloginapp.ui.adapter.TeknikAdapter;

import java.util.ArrayList;

public class TeknikActivity extends AppCompatActivity {
    private RecyclerView rvTeknik;
    private ArrayList<TeknikEntity>list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teknikbatiknew);

        rvTeknik = findViewById(R.id.rv_batik);
        rvTeknik.setHasFixedSize(true);

        list.addAll(TeknikBatik.getListBatik());
        showRecyclerList();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (rvTeknik.getVisibility() == View.VISIBLE){
            outState.putBoolean("reply_visible",true);
        }
    }

    private void showRecyclerList(){
        rvTeknik.setLayoutManager(new LinearLayoutManager(this));
        TeknikAdapter teknikAdapter = new TeknikAdapter(list);
        rvTeknik.setAdapter(teknikAdapter);
    }
}