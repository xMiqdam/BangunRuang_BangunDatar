package com.example.bangunruang_bangundatar.bangun_Ruang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bangunruang_bangundatar.R;

public class Tabungg extends AppCompatActivity {

    EditText etradius;
    EditText ettinggi;
    TextView tvHasil;

    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabungg);

        etradius = findViewById(R.id.etRadius);
        ettinggi = findViewById(R.id.etTinggi);
        tvHasil = findViewById(R.id.tvHasil);
        hitung = findViewById(R.id.btnHitung);



        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String radiusString = etradius.getText().toString().trim();
                String tinggiString = etradius.getText().toString().trim();


                if (radiusString.isEmpty() || tinggiString.isEmpty()) {
                    etradius.setError("Masukkan Radius persegi");
                    ettinggi.setError("Masukkan Tinggi persegi");

                    return;
                }
                double radius = Double.parseDouble(etradius.getText().toString());
                double tinggi = Double.parseDouble(etradius.getText().toString());
                double hasil = 0.0;

                hasil =  3.14 * radius * radius * tinggi;
                tvHasil.setText(hasil + "");
            }
        });
    }
}