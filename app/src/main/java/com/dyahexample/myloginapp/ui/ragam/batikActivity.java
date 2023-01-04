package com.dyahexample.myloginapp.ui.ragam;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dyahexample.myloginapp.R;
import com.dyahexample.myloginapp.caramembatikActivity;
import com.dyahexample.myloginapp.ui.teknik.TeknikActivity;
import com.dyahexample.myloginapp.ui.teknik.TeknikDetail;

public class batikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homkategory);

        Button btnRagam = (Button) findViewById(R.id.btn_motif);
        Button btnTeknik = (Button) findViewById(R.id.btn_teknik);
        Button btnCara = (Button) findViewById(R.id.btn_cara);

        btnRagam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(batikActivity.this, RagamBatik.class);
                startActivity(intent);
            }
        });
        btnTeknik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(batikActivity.this, TeknikActivity.class);
                startActivity(intent);
            }
        });
        btnCara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(batikActivity.this, caramembatikActivity.class);
                startActivity(intent);
            }
        });
    }
}