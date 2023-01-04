package com.dyahexample.myloginapp.ui.ragam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dyahexample.myloginapp.R;
import com.dyahexample.myloginapp.data.batik.BatikEntity;

public class detailActivity extends AppCompatActivity {
    TextView txtDeskripsi,txtNama;
    ImageView imgBatik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtNama = findViewById(R.id.motifBatik);
        txtDeskripsi = findViewById(R.id.batikDeskripsi);
        imgBatik = findViewById(R.id.imageBatik);

        BatikEntity batik = getIntent().getParcelableExtra("BATIK");
        Glide.with(detailActivity.this)
                .load(batik.getGambar())
                .into(imgBatik);
        txtNama.setText(batik.getName());
        txtDeskripsi.setText(batik.getDeskripsi());

    }
}