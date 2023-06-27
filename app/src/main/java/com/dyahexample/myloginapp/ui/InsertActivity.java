package com.dyahexample.myloginapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;
import com.dyahexample.myloginapp.R;
import com.dyahexample.myloginapp.db.Batik;
import com.dyahexample.myloginapp.db.BatikRepository;

public class InsertActivity extends AppCompatActivity {
    private BatikRepository batikRepository;
    private EditText etNama;
    private EditText etTeknik;
    private ListView listViewBatik;
    private ArrayAdapter<String> batikAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        batikRepository = new BatikRepository(this);

        etNama = findViewById(R.id.etNama);
        etTeknik = findViewById(R.id.etTeknik);
        listViewBatik = findViewById(R.id.listViewBatik);

        Button btnSimpan = findViewById(R.id.btnSimpan);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                String teknik = etTeknik.getText().toString();
                Batik batik = new Batik(nama, teknik);
                batikRepository.insertBatik(batik);
                etNama.setText("");
                etTeknik.setText("");
            }
        });

        // Menggunakan AsyncTask untuk mendapatkan data dari database di latar belakang
        new DatabaseTask().execute();
    }

    private class DatabaseTask extends AsyncTask<Void, Void, List<Batik>> {

        @Override
        protected List<Batik> doInBackground(Void... voids) {
            // Mendapatkan semua data dari database di latar belakang
            return batikRepository.getAllBatik();
        }

        @Override
        protected void onPostExecute(List<Batik> batikList) {
            super.onPostExecute(batikList);

            // Menampilkan data pada ListView
            String[] batikNames = new String[batikList.size()];
            for (int i = 0; i < batikList.size(); i++) {
                batikNames[i] = batikList.get(i).getNama();
            }

            batikAdapter = new ArrayAdapter<>(InsertActivity.this, android.R.layout.simple_list_item_1, batikNames);
            listViewBatik.setAdapter(batikAdapter);
        }
    }
}
