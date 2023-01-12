package com.dyahexample.myloginapp.ui.teknik;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.dyahexample.myloginapp.R;
import com.dyahexample.myloginapp.data.teknik.TeknikBatik;
import com.dyahexample.myloginapp.data.teknik.TeknikEntity;
import com.dyahexample.myloginapp.ui.adapter.teknik.TeknikAdapter;
import com.dyahexample.myloginapp.ui.adapter.teknik.TeknikGridAdapter;

import java.util.ArrayList;

public class TeknikActivity extends AppCompatActivity {
    private RecyclerView rvTeknik;
    private ArrayList<TeknikEntity>list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teknikbatiknew);

        rvTeknik = findViewById(R.id.rv_teknik);
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
    private void showRecyclerGrid(){
        rvTeknik.setLayoutManager(new GridLayoutManager(this, 2));
        TeknikGridAdapter teknikGridAdapter = new TeknikGridAdapter(list);
        rvTeknik.setAdapter(teknikGridAdapter);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public  boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
        }
    }
}
