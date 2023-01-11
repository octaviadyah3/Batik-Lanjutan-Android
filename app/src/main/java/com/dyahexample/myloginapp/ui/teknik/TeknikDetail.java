package com.dyahexample.myloginapp.ui.teknik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dyahexample.myloginapp.R;
import com.dyahexample.myloginapp.data.teknik.TeknikEntity;

public class TeknikDetail extends AppCompatActivity {

    TextView txtTeknik, txtDeskripsiTeknik;
    ImageView imgTeknik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teknik_detail);

        txtTeknik = findViewById(R.id.txtTeknik);
        txtDeskripsiTeknik = findViewById(R.id.teknikDeskripsi);
        imgTeknik = findViewById(R.id.imageTeknik);

        TeknikEntity teknik = getIntent().getParcelableExtra("TEKNIK");
        txtTeknik.setText(teknik.getTeknikBatik());
        txtDeskripsiTeknik.setText(teknik.getTeknikDeskripsi());
        Glide.with(TeknikDetail.this)
                .load(teknik.getTeknikGambar())
                .into(imgTeknik);

    }
}